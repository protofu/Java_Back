package com.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kosta.model.Post;
import com.kosta.model.User;
import com.kosta.util.DBConnection;

//DAO : Data Access Object (데이터에 접근)
public class PostDAO {
	private static final String DEL_CHK = " AND deleted_at IS NULL";

	public int addPost(Post post) throws SQLException, Exception {
		String sql = "INSERT INTO posts (id, user_id, content, image) VALUES (?, ?, ?, ?)";
		try	(
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		){
			psmt.setInt(1, post.getId());
			psmt.setInt(2, post.getUser_id());
			psmt.setString(3, post.getContent());
			psmt.setString(4, post.getImage());
			int resultRow = psmt.executeUpdate();
			return resultRow;	
		}
	}

	public Post getPost(int id) throws Exception {
		String sql = "SELECT * FROM posts WHERE id = ?" + DEL_CHK;
		try (
				Connection conn = DBConnection.getConnection();
				PreparedStatement psmt = conn.prepareStatement(sql);
			) {
				psmt.setInt(1, id);
				ResultSet rs = psmt.executeQuery();
				if (rs.next()) {
					return new Post(
						rs.getInt("id"), rs.getInt("user_id"), 
						rs.getString("content"), rs.getString("image"), 
						rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at")
					);
				}
			return null;
		}
	}

	public List<Post> getPostList() throws Exception {
		String sql = "SELECT * FROM posts WHERE 1 = 1" + DEL_CHK;
		try (Connection conn = DBConnection.getConnection();
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();) {
			List<Post> postList = new ArrayList<>();
			while (rs.next()) {
				Post post = new Post(rs.getInt("id"), rs.getInt("user_id"), rs.getString("content"),
						rs.getString("image"),
						rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at"));
				postList.add(post);
			}
			return postList;
		}
	}

	public int deletePost(int postId) throws Exception {
		// 		DB에서 삭제 (deleted_at = now())
		String sql = "UPDATE posts SET deleted_at = now() WHERE id = ?" + DEL_CHK;
		try (
				Connection conn = DBConnection.getConnection();
				PreparedStatement psmt = conn.prepareStatement(sql);
		){
			psmt.setInt(1, postId);
			return psmt.executeUpdate();		
		}
	}

	public int updatePost(Post post) throws Exception {
		String sql = "UPDATE posts SET content = ?, image = ? WHERE id = ?" + DEL_CHK;
		try (
				Connection conn = DBConnection.getConnection();
				PreparedStatement psmt = conn.prepareStatement(sql);
		){
			psmt.setString(1, post.getContent());
			psmt.setString(2, post.getImage());
			psmt.setInt(3, post.getId());
			return psmt.executeUpdate();		
		}
		
	}

	public List<Post> getLikedPostListByUser(int userId) throws Exception {
		String sql = "SELECT p.* FROM likes l Join posts p ON l.post_id = p.id WHERE l.user_id = ? AND l.deleted_at IS NULL AND p.deleted_at IS NULL";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		) {
			psmt.setInt(1, userId);
			ResultSet rs = psmt.executeQuery();
			List<Post> postList = new ArrayList<>();
			while (rs.next()) {
				Post post = new Post(rs.getInt("id"), rs.getInt("user_id"), rs.getString("content"),
						rs.getString("image"),
						rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at"));
				postList.add(post);
			}
			return postList;
		}
	}
	
	public int addLike(int userId, int postId) throws Exception {
		String sql = "INSERT INTO likes (user_id, post_id) VALUES (?, ?)";
		try	(
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		){
			psmt.setInt(1, userId);
			psmt.setInt(2, postId);

			int resultRow = psmt.executeUpdate();
			return resultRow;	
		}
	}

	public List<Post> getUnlikedPostListByUser(int userId) throws Exception {
		String sql = "SELECT p.* FROM likes l Join posts p ON l.post_id = p.id WHERE l.user_id = ? AND p.deleted_at IS NULL";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		) {
			psmt.setInt(1, userId);
			ResultSet rs = psmt.executeQuery();
			List<Post> postList = new ArrayList<>();
			while (rs.next()) {
				Post post = new Post(rs.getInt("id"), rs.getInt("user_id"), rs.getString("content"),
						rs.getString("image"),
						rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at"));
				postList.add(post);
			}
			return postList;
		}
	}

	public int deleteLike(int userId, int postId) throws Exception {
		String sql = "DELETE FROM likes WHERE user_id = ? AND post_id = ?";
		try	(
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		){
			psmt.setInt(1, userId);
			psmt.setInt(2, postId);

			int resultRow = psmt.executeUpdate();
			return resultRow;	
		}
	}

}
