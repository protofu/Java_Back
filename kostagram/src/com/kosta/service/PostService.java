package com.kosta.service;

import java.util.List;

import com.kosta.controller.KostagramExample;
import com.kosta.dao.PostDAO;
import com.kosta.dao.UserDAO;
import com.kosta.model.Post;
import com.kosta.model.User;

// Service : 비지니스 로직 수행
public class PostService {
	private UserDAO userDao = new UserDAO();
	private PostDAO postDao = new PostDAO();
	
	private String getInput(String name, boolean isRequire) {
		System.out.print(name + " 입력 : ");
		String input = KostagramExample.sc.nextLine();
		if (input.equals("") && isRequire == false) {
			input = null;
		} else {
			while (input.equals("") && isRequire == true) {
				input = getInput(name, isRequire);
			}
		}
		return input;
	}
	
	public void writePost() throws Exception {
		// PostService의 writePost()
		System.out.println("\n ----- 게시물 작성 -----");
		// 사용자 아이디, 게시글 내용 & 이미지 입력 [id로 유저 존재하는지 확인]
		List<User> userList = userDao.getUserList();
		for (User user : userList) {
			System.out.print(user.getId() + "\t" + user.getName() + "\n");
		}
		int userId = Integer.parseInt(getInput("ID", true));
		User user = userDao.getUser(userId);
		if (user == null) {
			System.out.println("존재하지 않는 유저 입니다.");
			return;
		}
		
		String content = getInput("내용", false);
		String image = getInput("이미지 파일명", true);
		
		Post newPost = new Post(0, userId, content, image, null, null, null);
		
		// PostDAO의 addPost();
		//		DB에 추가
		int resultRow = postDao.addPost(newPost);
		
		if (resultRow > 0) {
			System.out.println(resultRow + "개의 게시물이 작성되었습니다.");
		} else {
			System.out.println("게시물 작성 실패");
		}
	}

	public void modifyPost() throws Exception {
		System.out.println("\n ----- 게시물 수정 -----");
		//		전체 목록 출력 -> 특정 게시물 아이디 입력 받고,
		PrintAllPosts();
		int postId = Integer.parseInt(getInput("수정할 post ID", true));
		Post post = postDao.getPost(postId);
		if (post == null) {
			System.out.println("없는 게시물 입니다.");
			return;
		}
		String content = getInput("수정할 내용", false);
		String image = getInput("수정할 이미지 파일명", false);
		if (content != null) post.setContent(content);
		if (image != null) post.setImage(image);
		// 	게시글 내용, 이미지 수정 (내용만 수정도, 이미지만 수정도 가능)
		int resultRow = postDao.updatePost(post);
		if (resultRow >0) {
			System.out.println("게시물 수정 성공");
		} else {
			System.out.println("게시물 수정 실패");
		}
		
		
	}

	public void PrintAllPosts() throws Exception {
		System.out.println("\n ----- 게시물 전체를 출력합니다. -----");
		List<Post> postList = postDao.getPostList();
		
		System.out.println("ID \t\t 작성자 \t\t 내용 \t\t 이미지");
		System.out.println("------".repeat(10));
		for (Post post : postList) {
			User user = userDao.getUser(post.getUser_id());
			System.out.println(post.getId() + "\t\t" + (user != null ? user.getName() : "익명") + "\t\t" + post.getContent() +"\t\t"+ post.getImage());
		}
	}

	public void deletePost() throws Exception {
		//		전체 목록 출력 -> 특정 게시물 아이디 입력 받고,
		List<Post> postList = postDao.getPostList();
		System.out.println("ID \t\t 작성자 \t\t 내용 \t\t 이미지");
		System.out.println("------".repeat(10));
		for (Post post : postList) {
			User user = userDao.getUser(post.getUser_id());
			System.out.println(post.getId() + "\t\t" + (user != null ? user.getName() : "익명") + "\t\t" + post.getContent() +"\t\t"+ post.getImage());
		}
		// 		게시글 삭제
		int postId = Integer.parseInt(getInput("삭제할 게시물 ID", true));
		int resultRow = postDao.deletePost(postId);
		if (resultRow > 0) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		}

	}

	public void likePost() throws Exception {
		List<User> userList = userDao.getUserList();
		for (User user : userList) {
			System.out.print(user.getId() + "\t" + user.getName() + "\n");
		}
		int userId = Integer.parseInt(getInput("좋아요 할 사용자 아이디", true));
		User user = userDao.getUser(userId);
		if (user == null) {
			System.out.println("존재하지 않는 유저 입니다.");
			return;
		}
		PrintAllPosts();
//		List<Post> likedPostList = postDao.getLikedPostListByUser(userId);
//		for (Post p : likedPostList) {
//			User writer = userDao.getUser(p.getUser_id());
//			System.out.println(p.getId() + "\t\t" + (writer != null ? writer.getName() : "익명") + "\t\t" + p.getContent() +"\t\t"+ p.getImage());
//			
//		}
		int postId = Integer.parseInt(getInput("좋아요 할 post ID", true));
		Post post = postDao.getPost(postId);
		if (post == null) {
			System.out.println("없는 게시물 입니다.");
			return;
		}
		int resultRow = postDao.addLike(userId, postId);
		if (resultRow > 0) {
			System.out.println(user.getName() + "님이 해당 게시물 좋아요");
		}
	}

	public void unlikePost() throws Exception {
		List<User> userList = userDao.getUserList();
		for (User user : userList) {
			System.out.print(user.getId() + "\t" + user.getName() + "\n");
		}
		int userId = Integer.parseInt(getInput("좋아요 취소할 사용자 아이디", true));
		User user = userDao.getUser(userId);
		if (user == null) {
			System.out.println("존재하지 않는 유저 입니다.");
			return;
		}
		List<Post> likedPostList = postDao.getLikedPostListByUser(userId);
		for (Post p : likedPostList) {
			User writer = userDao.getUser(p.getUser_id());
			System.out.println(p.getId() + "\t\t" + (writer != null ? writer.getName() : "익명") + "\t\t" + p.getContent() +"\t\t"+ p.getImage());
			
		}
		int postId = Integer.parseInt(getInput("좋아요 취소할 post ID", true));
		Post post = postDao.getPost(postId);
		if (post == null) {
			System.out.println("없는 게시물 입니다.");
			return;
		}
		int resultRow = postDao.deleteLike(userId, postId);
		if (resultRow > 0) {
			System.out.println(user.getName() + "님이 해당 게시물 싫어요");
		} else {
			System.out.println(user.getName() + "님이 해당 게시물 싫어요 실패!");
		}
	}
}
