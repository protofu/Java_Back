package com.kosta.service;

import java.sql.SQLException;

import com.kosta.controller.KostagramExample;
import com.kosta.model.User;

public class UserServiceImpl implements UserService {
	@Override
	public User getUser(int id) throws SQLException {
		String sql = "SELECT * FROM users WHERE id = ? AND deleted_at IS NULL ";
		KostagramExample.pstmt = KostagramExample.conn.prepareStatement(sql);
		KostagramExample.pstmt.setInt(1,  id);
		
		KostagramExample.rs = KostagramExample.pstmt.executeQuery();
		
		User u = null;
		if (KostagramExample.rs.next()) {
			u = new User(
				id, 
				KostagramExample.rs.getString("name"), 
				KostagramExample.rs.getString("email"), 
				KostagramExample.rs.getString("password"), 
				KostagramExample.rs.getString("bio"), 
				KostagramExample.rs.getString("profile_pic"), 
				null,
				null,
				null					
			);
		}
		return u;
	}
	@Override
	public void addUser() throws SQLException {
		System.out.println("\n ============== 회원가입 ==============");
		String sql = "INSERT INTO users (name, email, password, bio, profile_pic) Values (?, ?, ?, ?, ?)";
		System.out.print("이름 입력 : ");
		String name = KostagramExample.sc.nextLine();
		System.out.print("이메일 입력 : ");
		String email = KostagramExample.sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = KostagramExample.sc.nextLine();
		System.out.print("소개글 : ");
		String bio = KostagramExample.sc.nextLine();
		bio = bio.equals("") ? null : bio;
		System.out.print("프로필 파일명 : ");
		String profile_pic = KostagramExample.sc.nextLine();
		profile_pic = profile_pic.equals("") ? null : profile_pic;
		
		KostagramExample.pstmt = KostagramExample.conn.prepareStatement(sql);
		KostagramExample.pstmt.setString(1, name);
		KostagramExample.pstmt.setString(2, email);
		KostagramExample.pstmt.setString(3, password);
		KostagramExample.pstmt.setString(4, bio);
		KostagramExample.pstmt.setString(5, profile_pic);
		
		int resultRow = KostagramExample.pstmt.executeUpdate();
		if (resultRow != 0) System.out.println("가입 완료");
		else System.out.println("가입 실패");
	}

	@Override
	public void delUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFollow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delFollow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getFollowList() {
		// TODO Auto-generated method stub
		
	}


	
}
