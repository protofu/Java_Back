USE study_db;

CREATE TABLE contact (
	idx INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    addr VARCHAR(255),
    tel VARCHAR(20),
    email VARCHAR(255),
    birthday DATE
)ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

ALTER TABLE contact ADD COLUMN age INT;
DESC contact;
ALTER TABLE contact DROP age;
SELECT * FROM contact;

# 테이블의 기존 컬럼 자료형과 이름 변경
ALTER TABLE contact CHANGE tel phone INT;
desc contact;
ALTER TABLE contact CHANGE phone tel VARCHAR(255);
ALTER TABLE contact MODIFY tel VARCHAR(255);

# 테이블 컬럼 순서 조정
ALTER TABLE contact MODIFY COLUMN email VARCHAR(255) AFTER name;

-- DROP TABLE contact;
SHOW TABLES;
SELECT * FROM students;
desc students;
INSERT INTO students Values
	(null, '정서연', '2000-12-10', '서울', 'ISTJ'),
    (null, '권지훈', '2000-01-31', '서울', 'INTJ'),
    (null, '한민혁', '2000-09-29', '인천', 'ESFP'),
    (null, '박진국', '2000-08-21', '서울', 'INFP'),
    (null, '성제현', '2000-04-22', '대구', 'ENFP');

SELECT * FROM students;

# enum 타입 데이터 컬럼 추가
ALTER TABLE students ADD COLUMN gender ENUM('남', '여');

CREATE TABLE tNullable (
	name CHAR(10) NOT NULL,
    age INT #NULL
);

INSERT INTO tNullable (name, age) Value ('흥부', 36);
INSERT INTO tNullable (name) Value ('흥부');
INSERT INTO tNullable (age) Value (23);

CREATE TABLE tcitydefault(
	name CHAR(10) PRIMARY KEY,
    area INT NOT NULL DEFAULT 0,
    popu INT NOT NULL DEFAULT 0,
    metro ENUM('y', 'n') NOT NULL DEFAULT 'n',
    region CHAR(6) NULL
);
INSERT INTO tcitydefault (name, area, popu, region) Values
	('진주', 712, 34,'경상'),
    ('인천', 1063, 295, '경기'),
    ('강릉', 131, 24, '강원')
;
INSERT INTO tcitydefault (name) Values ('군산');
UPDATE tcitydefault SET metro = 'y' WHERE name = '인천';
UPDATE tcitydefault SET metro = DEFAULT WHERE name = '인천';

SELECT * FROM tcitydefault;

CREATE TABLE tcheck(
	gender CHAR(3) CHECK(gender = '남' or gender = '여'),
    grade INT CHECK(grade BETWEEN 1 AND 3),
    origin CHAR(3) CHECK(origin IN ('동', '서', '남', '북')),
    name CHAR(12) CHECK(name LIKE '김%')
);
INSERT INTO tcheck Values ('남', 3, '동', '김밥');
SELECT * FROM tcheck;


CREATE TABLE tstaffdefault (
	depart VARCHAR(255) DEFAULT '영업부' 
    CHECK (depart IN ('영업부', '총무부', '인사과')),
    grade VARCHAR(255) DEFAULT '수습',
    salary INT DEFAULT 280 CHECK (salary > 0),
    achive DOUBLE DEFAULT 1.0,
    gender ENUM('남', '여') NOT NULL DEFAULT '남'
);
desc tstaffdefault;
SELECT * FROM tstaffdefault;
INSERT INTO tstaffdefault Values
	('총무부', '계약직', 350, 1.8, DEFAULT),
    ('인사과', '사원', 290, 1.5, '여'),
    ('영업부', '차장', 390, 2.4, DEFAULT),
    (DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT)
;
DELETE FROM tstaffdefault;

# 슈퍼키 - 레코드를 유일하게 만드는 속성들의 조합 (1개의 조합 이상)
# 후보키 - 슈퍼키 중에서 속성의 개수를 최소화한 것들
# 기본키 - 후보키 중에서 지정한 키 (테이블에 오직 1개의 키_복합키 가능)

-- 이름과 부서와 성별을 복합키로 지정
-- 새로운 직원 테이블 tstaffcompokey 생성
CREATE TABLE tstaffcompokey (
	name CHAR(15),
    depart VARCHAR(255) DEFAULT '영업부' 
    CHECK (depart IN ('영업부', '총무부', '인사과')),
    grade VARCHAR(255) DEFAULT '수습',
    salary INT DEFAULT 280 CHECK (salary > 0),
    achive DOUBLE DEFAULT 1.0,
    gender ENUM('남', '여') NOT NULL DEFAULT '남',
	CONSTRAINT ck_pk PRIMARY KEY (name, depart, gender)
);

CREATE TABLE tPrimary (
	isLongHair BOOLEAN CHECK (isLongHair IN (1, 0)),
    isGlasses BOOLEAN CHECK (isGlasses IN (1, 0)),
    gender ENUM('남', '여'),
    CONSTRAINT ct_pk PRIMARY KEY(isLongHair, isGlasses, gender)
);
DROP TABLE tprimary;
INSERT INTO tprimary Values
	(0, 0, '남'),
    (0, 0, '여'),
    (0, 1, '남'),
    (0, 1, '여'),
    (1, 0, '남'),
    (1, 0, '여'),
    (1, 1, '남'),
    (1, 1, '여');    
SELECT * FROM tprimary;

CREATE TABLE tsale (
	saleno INT AUTO_INCREMENT PRIMARY KEY,
    customer VARCHAR(10),
    product VARCHAR(30)
);
SELECT * FROM tsale;
INSERT INTO tsale (customer, product) Values
	("단군", "지팡이"),
    ("고주몽", "고등어");
DELETE FROM tsale WHERE saleno=2;
INSERT INTO tsale (customer, product) Values
	("박혁거세", "계란");
ALTER TABLE tsale AUTO_INCREMENT = 1;
INSERT INTO tsale (customer, product) Values
	("고주몽", "고등어");
    
UPDATE tsale SET product="김밥" WHERE saleno=LAST_INSERT_ID();
SELECT * FROM tsale;

# 참조 무결성 example (외래키 미설정)
CREATE TABLE temployee (
	name CHAR(10) PRIMARY KEY,
    salary INT NOT NULL,
    addr VARCHAR(30) NOT NULL
);

INSERT INTO temployee Values
	('아이린', 650, '대구'),
    ('슬기', 480, '안산'),
    ('웬디', 625, '서울');
    
SELECT * FROM temployee;

CREATE TABLE tproject(
	proID INT PRIMARY KEY,
    emp CHAR(10) NOT NULL,
    proj VARCHAR(30) NOT NULL,
    cost INT
);

INSERT INTO tproject Values
	(1, '아이린', '홍콩 수출건', 800),
    (2, '아이린', 'TV 광고건', 3400),
    (3, '아이린', '매출 분석건', 200),
    (4, '슬기', '경영 혁신안 작성', 120),
    (5, '슬기', '대리점 계획', 85),
    (6, '웬디', '노조 협상건', 24);
    
SELECT * FROM tproject;

-- JOIN 사용, 대구출신 직원 -> 프로젝트 조회
SELECT name, addr, proj
FROM tproject
JOIN temployee ON emp = name
WHERE addr = '대구';

DROP TABLE temployee;
DROP TABLE tproject;

# 참조 무결성 Example (외래키 설정)
CREATE TABLE temployee (
	name CHAR(10) PRIMARY KEY,
    salary INT NOT NULL,
    addr VARCHAR(30) NOT NULL
);

INSERT INTO temployee Values
	('아이린', 650, '대구'),
    ('슬기', 480, '안산'),
    ('웬디', 625, '서울');
    
SELECT * FROM temployee;

CREATE TABLE tproject(
	proID INT PRIMARY KEY,
    emp CHAR(10) NOT NULL,
    proj VARCHAR(30) NOT NULL,
    cost INT,
    CONSTRAINT FK_employee FOREIGN KEY (emp) REFERENCES temployee(name)
);

INSERT INTO tproject Values
	(1, '아이린', '홍콩 수출건', 800),
    (2, '아이린', 'TV 광고건', 3400),
    (3, '아이린', '매출 분석건', 200),
    (4, '슬기', '경영 혁신안 작성', 120),
    (5, '슬기', '대리점 계획', 85),
    (6, '웬디', '노조 협상건', 24);
    
SELECT * FROM tproject;

-- INSERT INTO tproject Values (7, '조이', '원자재 수입', 9000);
-- DELETE FROM temployee WHERE name = '아이린';