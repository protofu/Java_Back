package com.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kosta.model.User;
import com.kosta.util.DBConnection;

// DAO : Data Access Object (데이터에 접근)
public class UserDAO {
	private static final String DEL_CHK = " AND deleted_at IS NULL";

	public int addUser(User user) throws Exception {
		String sql = "INSERT INTO users (name, email, password, bio, profile_pic) VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = DBConnection.getConnection(); PreparedStatement psmt = conn.prepareStatement(sql);) {
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getEmail());
			psmt.setString(3, user.getPassword());
			psmt.setString(4, user.getBio());
			psmt.setString(5, user.getProfile_pic());
			int resultRow = psmt.executeUpdate();
			return resultRow;
		}
	}

	public User getUser(int id) throws Exception {
		String sql = "SELECT * FROM users WHERE id = ?" + DEL_CHK;
		try (Connection conn = DBConnection.getConnection(); PreparedStatement psmt = conn.prepareStatement(sql);) {
			psmt.setInt(1, id);
			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("password"),
						rs.getString("bio"), rs.getString("profile_pic"), rs.getDate("created_at"),
						rs.getDate("updated_at"), rs.getDate("deleted_at"));
			}
		}
		return null;
	}

	public int deleteUser(int user_id) throws Exception {
		String sql = "UPDATE users SET deleted_at = now() WHERE id = ?" + DEL_CHK;
		try (Connection conn = DBConnection.getConnection(); PreparedStatement psmt = conn.prepareStatement(sql);) {
			psmt.setInt(1, user_id);
			return psmt.executeUpdate();
		}
	}

	public List<User> getUserList() throws Exception {
		String sql = "SELECT * FROM users WHERE 1 = 1" + DEL_CHK;
		try (Connection conn = DBConnection.getConnection();
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();) {
			List<User> userList = new ArrayList<>();
			while (rs.next()) {
				User user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getString("password"), rs.getString("bio"), rs.getString("profile_pic"),
						rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at"));
				userList.add(user);
			}
			return userList;
		}
	}

	public int addFollower(int user_id, int target_id) throws Exception {
		String sql = "INSERT INTO followers (following_id, followed_id) Values (?, ?) ON DUPLICATE KEY UPDATE deleted_at = NULL";
		try (
				Connection conn = DBConnection.getConnection(); 
				PreparedStatement psmt = conn.prepareStatement(sql);
			) {
				psmt.setInt(1, user_id);
				psmt.setInt(2, target_id);
				return psmt.executeUpdate();
		}
	}

	public List<User> getFollowers(int id) throws Exception {
		// id를 팔로우 하는 사용자 리스트
		String sql = "SELECT ed.* FROM followers f "
				+ "join users ing ON ing.id = f.following_id "
				+ "join users ed ON ed.id = f.followed_id "
				+ "WHERE ing.id = ? AND f.deleted_at IS NULL";

		try (
				Connection conn = DBConnection.getConnection();
				PreparedStatement psmt = conn.prepareStatement(sql);
			) {
				psmt.setInt(1, id);
				List<User> userList = new ArrayList<>();
				ResultSet rs = psmt.executeQuery();
				while (rs.next()) {
					User user = new User(
						rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getString("password"), rs.getString("bio"), rs.getString("profile_pic"),
						rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at")
					);
					userList.add(user);
			}
			return userList;
		}
	}

	public int deleteFollower(int user_id, int target_id) throws Exception {
		String sql = "UPDATE followers SET deleted_at = now() "
				+ "WHERE following_id = ? AND followed_id = ?" 
				+ DEL_CHK;
		try (
				Connection conn = DBConnection.getConnection(); 
				PreparedStatement psmt = conn.prepareStatement(sql);
			) {
				psmt.setInt(1, user_id);
				psmt.setInt(2, target_id);
				return psmt.executeUpdate();
		}
	}

}
