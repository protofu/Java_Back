-- SNS 데이터 베이스 구성하기
# 데이터베이스 생성 kostagram
drop database if exists kostagram;
# 테이블 (users, posts, followers, likes)
create database kostagram;
use kostagram;
# users 
# [
#  id INT AUTO_INCREMENT PRIMARY KEY, 
#  email VARCHAR(100) NOT NULL, 
#  name VARCHAR(100) NOT NULL UNIQUE, 
#  password VARCHAR(255) NOT NULL, 
#  bio TEXT, 
#  profile_pic VARCHAR(255), 
#  created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
#  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
#  deleted_at DATETIME 
# ]

create table users (
	id INT AUTO_INCREMENT PRIMARY KEY, 
	email VARCHAR(100) NOT null UNIQUE, 
	name VARCHAR(100) NOT NULL, 
	password VARCHAR(255) NOT NULL, 
	bio TEXT, 
	profile_pic VARCHAR(255), 
	created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
	updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
	deleted_at DATETIME
);
INSERT INTO users (email, name, password, bio, profile_pic, deleted_at)
VALUES 
('alice@example.com', 'alice', 'password123', 'Alice is a software engineer.', 'alice.jpg', NULL),
('bob@example.com', 'bob', 'password123', 'Bob is a graphic designer.', 'bob.jpg', NULL),
('charlie@example.com', 'charlie', 'password123', 'Charlie is a project manager.', 'charlie.jpg', '2024-01-01 00:00:00'),
('dave@example.com', 'dave', 'password123', 'Dave is a content writer.', 'dave.jpg', NULL),
('eve@example.com', 'eve', 'password123', 'Eve is a data scientist.', 'eve.jpg', NULL);
delete from users where name = 'alice';
# posts
# [
#	id,
#	user_id,
#	content,
#	image,
#	created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
#	updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
#	deleted_at DATETIME 
#	유저 아이디는 users 테이블과 관계가 있다.(유저가 삭제되면 게시물도 삭제 CASCADE)
# ]
create table posts (
	id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT not NULL,
	content TEXT,
	image VARCHAR(255),
	created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
	updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
	deleted_at DATETIME,
-- 	유저 아이디는 users 테이블과 관계가 있다.(유저가 삭제되면 게시물도 삭제 CASCADE)
	constraint fk_users foreign key(user_id) references users(id) on delete cascade
);
INSERT INTO posts (user_id, content, image)
VALUES 
(2, "안녕!", "이미지이이이익.jpg");
-- ALTER TABLE posts AUTO_INCREMENT=1;
delete from posts where user_id = 2;
# likes
# [
#	id,
#	user_id,
#	post_id,
#	created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
#	deleted_at DATETIME
#	유저 아이디는 users 테이블과 관계가 있다. (유저가 삭제되면 좋아요도 같이 삭제 CASCADE) 
# 	포스트아이디는 posts 테이블과 관계가 있다. (게시물이 삭제되면 좋아요도 같이 삭제 CASCADE)
# ]
create table likes (
	id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT not NULL,
	post_id INT not NULL,
	created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
	deleted_at DATETIME,
	constraint fk_usersTO_likes foreign key(user_id) references users(id) on delete cascade,
	constraint fk_posts foreign key(post_id) references posts(id) on delete cascade,
	unique key(user_id, post_id)	
);

# followerS
# [
#	id,
#	following_id,
#	followed_id,
#	created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
#	deleted_at DATETIME
# 	팔로잉 아이디는 users 테이블과 관계가 있다. (유저가 삭제되면 같이 삭제)
# 	팔로우드 아이디는 users 테이블과 관계가 있다. (유저가 삭제되면 같이 삭제)
# ]

create table followers (
	id INT AUTO_INCREMENT PRIMARY KEY,
	following_id INT not NULL,
	followed_id INT not NULL,
	created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
	deleted_at DATETIME,
	constraint fk_users_following foreign key(following_id) references users(id) on delete cascade,
	constraint fk_users_followed foreign key(followed_id) references users(id) on delete cascade
);


# 데이터 삽입
insert into users (`name`, `email`, `password`) values
("류준열", "ryu@gmail.com", "1234"),
("혜리", "hr@gmail.com", "1234"),
("한소희", "hsh@gmail.com", "1234"),
("최인규", "choi@gmail.com", "1234");

insert into posts (`user_id`, `content`, `image`) values
(2, "어이가 없네?", "hr.jpg"),
(3, "환승 아닙니다", "hsh.jpg");

select * from users where deleted_at is null;

-- 게시물 전체 조히
select *, u.name from posts p
join users u on p.user_id = u.id
where p.deleted_at is null;
-- 특정 사용자 게시물 조회
select *, u.name from posts p
join users u on p.user_id = u.id
where p.deleted_at is null and u.id = 3;
-- 팔로우 하기
insert into `followers` (following_id, followed_id) values
(2, 1) on duplicate key update deleted_at = null;
-- 언팔
update followers 
set deleted_at = now()
where following_id = 2 and
followed_id = 1 and deleted_at is null;

select f.id, ing.name `팔로우 한`, ed.name `팔로우 당한` from followers f
join users ing on ing.id = f.following_id 
join users ed on ed.id = f.followed_id 
where f.deleted_at is null;

select * from likes;
select * from followers;
select * from posts;
-- 특정 ㅅ ㅏ용자가 특정 게시물 좋아요
insert into `likes` (user_id, post_id) values
(1, 1) on duplicate key update deleted_at = null;
-- 특정 사용자가 특정 게시물 좋아요 취소
update `likes`
set deleted_at = now()
where user_id = 1 and post_id = 1 and deleted_at is null;
-- 특정 사용자 팔로워 수, 팔로잉 수 조회
select
(select count(*) from followers where following_id = 2 group by following_id) as "내가 팔로잉",  
(select count(*) from followers where followed_id = 2 group by followed_id) as "나를 팔롱";
-- 특정 사용자 팔로워 목록 조회
select ed.* from users u 
join followers f on u.id = f.following_id
join users ed on f.followed_id = ed.id
where u.id = 1; 
-- 특정 사용자 팔로잉 목록 조회
select ed.* from followers f
join users ing on f.following_id = ing.id
join users ed on f.followed_id = ed.id
where ing.id = 2;