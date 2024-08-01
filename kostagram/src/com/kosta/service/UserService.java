package com.kosta.service;

import java.util.List;

import com.kosta.controller.KostagramExample;
import com.kosta.dao.UserDAO;
import com.kosta.model.User;

// Service : 비지니스 로직 수행
public class UserService {
	private UserDAO userDao = new UserDAO();

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

	public void signUpUser() throws Exception {
		System.out.println("\n----- 회원가입을 진행합니다 -----");
		String name = getInput("이름", true);
		String email = getInput("이메일", true);
		String pw = getInput("비밀번호", true);
		String bio = getInput("소개글", false);
		String profile = getInput("프로필 사진 파일명", false);

		// DTO 모델 생성
		User newUser = new User(0, name, email, pw, bio, profile, null, null, null);

		// 데이터 삽입 동작 수행
		int resultRow = userDao.addUser(newUser);

		// 결과 출력
		if (resultRow > 0) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}

	public void withdrawalUser() throws Exception {
		System.out.println("\n----- 회원 탈퇴를 진행합니다 -----");
		int user_id = Integer.parseInt(getInput("사용자 아이디", true));

		// user_id를 통한 유저 정보를 가져오기
		User user = getUser(user_id);
		if (user != null) {
			System.out.println(user.getName() + " 을/를 삭제하시겠습니까? (Y/N)");
			String answer = KostagramExample.sc.nextLine().toLowerCase();
			if (answer.equals("y")) {
				// 데이터 삭제 수행
				int resultRow = userDao.deleteUser(user_id);
				if (resultRow > 0) {
					System.out.println("정상적으로 탈퇴되었습니다.");
					return;
				}
			} else return;
		}
		System.out.println("이미 탈퇴되었거나 없는 사용자입니다.");
	}

	private User getUser(int id) throws Exception {
		User user = userDao.getUser(id);
		return user;
	}
	
	public void printAllUsers() throws Exception {
		System.out.println("\n ----- 회원 전체를 출력합니다. -----");
		List<User> userList = userDao.getUserList();
		System.out.println("ID \t 이름");
		System.out.println("------".repeat(10));
		for (User user : userList) {
			System.out.println(user.getId() + "\t" + user.getName());
		}
	}

	public void followUser() throws Exception {
		printAllUsers();
		System.out.println("눈교");
		int user_id = Integer.parseInt(getInput("ID", true));
		User user = getUser(user_id);
		System.out.println("\n ----- " + user.getName() + " 팔로우 진행 -----");
		System.out.println("팔로할 사람");
		int target_id = Integer.parseInt(getInput("팔로우 할 아이디", true));
		User target = getUser(target_id);
		
		if (user_id == target_id) {
			System.out.println("자기 자신은 팔로우할 수 없습니다.");
		} else {			
			int resultRow = userDao.addFollower(user_id, target_id);
			if (resultRow > 0) {
				System.out.println(user.getName() + " 이/가 " + target.getName() + " 을/를 팔로우 했습니다.");
				// user 팔로우 리스트 출력
				System.out.println(user.getName() + " 이/가 팔로우 하는 회원들");
				printAllFollowers(user_id);
			}
		}
	}
 
	public void printAllFollowers(int id) throws Exception {
		List<User> userList = userDao.getFollowers(id);
		System.out.println("ID \t 이름");
		System.out.println("-----".repeat(10));
		for (User user : userList) {
			System.out.println(user.getId() + "\t" + user.getName());
		}
	}

	public void unfollowUser() throws Exception {
		printAllUsers();
		System.out.println("눈교");
		int user_id = Integer.parseInt(getInput("ID", true));
		User user = getUser(user_id);
		System.out.println("\n ----- " + user.getName() + " 언팔로우 진행 -----");
		System.out.println(user.getName() + " 이/가 팔로우 하는 회원들");
		printAllFollowers(user_id);
		
		System.out.println("언팔로할 사람");
		int target_id = Integer.parseInt(getInput("언팔로우 할 아이디", true));
		User target = getUser(target_id);
		
		int resultRow = userDao.deleteFollower(user_id, target_id);
		if (resultRow > 0) {
			System.out.println(user.getName() + " 이/가 " + target.getName() + " 을/를 언팔로우 했습니다.");		
		}
			
	}
}
