package com.kosta.service;

import java.sql.Date;
import java.sql.SQLException;

import com.kosta.controller.KostagramExample;
import com.kosta.model.Post;
import com.kosta.model.User;

public class PostServiceImpl implements PostService{

	private static UserService us = new UserServiceImpl();
	
	@Override
	public void getPostList() throws SQLException {
		System.out.println("\n ============== 전체 게시물 ==============");
		String sql = "SELECT * FROM posts WHERE deleted_at IS NULL";
		
		KostagramExample.pstmt = KostagramExample.conn.prepareStatement(sql);
		KostagramExample.rs = KostagramExample.pstmt.executeQuery();
		while(KostagramExample.rs.next()) {
			int id = KostagramExample.rs.getInt(1);
			int userId = KostagramExample.rs.getInt(2);
			String content = KostagramExample.rs.getString(3);
			String image = KostagramExample.rs.getString(4);
			Date createdAt = KostagramExample.rs.getDate(5);
			Date updateAt = KostagramExample.rs.getDate(6);
			User u = us.getUser(userId);
			
			Post p = new Post(id, u, content, image, null, null, null);
			System.out.println(p);
		}
	}

	@Override
	public void addPost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delPost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLike() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delLike() {
		// TODO Auto-generated method stub
		
	}

}
