package com.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection2 {
	public static Connection conn = null;
	public static PreparedStatement stmt = null;
	public static ResultSet rs = null;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 드라이버 생성
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/kostagram";
			String id = "root";
			String password = "1234";
			// DB 연결
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("DB Connect Complete!");
			// CRUD
// -----------------------회원 추가--------------------------------------
			System.out.println("----회원 추가----");
			// sql문 작성
			String addUserSql = "INSERT INTO users (name, email, password) Values (?, ?, ?)";
			stmt = conn.prepareStatement(addUserSql);

			// 입력 받고
			System.out.print("Name : ");
			String userName = br.readLine();
			// set 해주기
			stmt.setString(1, userName);
			
			// 입력 받고
			System.out.print("Email : ");
			String userEmail = br.readLine();
			// set 해주기
			stmt.setString(2, userEmail);
			
			// 입력 받고			
			System.out.print("Password : ");
			String userPassword = br.readLine();
			// set 해주기
			stmt.setString(3, userPassword);
			
			// 실행
			int addUserRow = stmt.executeUpdate();
			System.out.println(addUserRow + " User Join");

// ------------회원 전체 확인--------------------------------------------
			System.out.println("----전체 회원----");
			// sql 작성
			String searchSql = "SELECT * FROM users WHERE deleted_at is null";
			// sql 적용 및 ResultSet으로 반환
			rs = conn.prepareStatement(searchSql).executeQuery();
			// users가 있을 때 까지 출력
			while(rs.next()) {
				System.out.println(
					rs.getInt("id")+ "\t" +
					rs.getString("name")+ "\t" +
					rs.getString("email")+ "\t\t" +
					rs.getString("password")+ "\t"
				);
			}
// -------------------------------------------------------------------
// ------------------게시물 등록-----------------------------------------
			System.out.println("----게시물 등록----");
			// sql 작성
			String addPostSql = "INSERT INTO posts (user_id, content, image) Values (?, ?, ?)";
			stmt = conn.prepareStatement(addPostSql);
			
			System.out.print("userId : ");
			int userId = Integer.parseInt(br.readLine());
			
			System.out.print("Content : ");
			String content = br.readLine();
			
			System.out.print("Image : ");
			String image = br.readLine();

			stmt.setInt(1, userId);
			stmt.setString(2, content);
			stmt.setString(3, image);
			
			int addedPostRow = stmt.executeUpdate();
			System.out.println(addedPostRow + "개의 게시물이 등록되었습니다.");
// -------------------------------------------------------------------
// ------------게시물 수정-----------------------------------------------
			System.out.println("----게시물 수정----");
			String updatePostSql = "UPDATE posts SET content = ? WHERE id = ? AND deleted_at IS Null";
			stmt = conn.prepareStatement(updatePostSql);
			
			System.out.print("PostId : ");
			stmt.setInt(2, Integer.parseInt(br.readLine()));

			System.out.print("Content : ");
			stmt.setString(1, br.readLine());
			
			
			int updatePostRow = stmt.executeUpdate();
			System.out.println(updatePostRow + "개의 게시물이 수정되었습니다.");
// -------------------------------------------------------------------
// ------------특정 게시물 보기-------------------------------------------
			System.out.println("----특정 유저의 게시물 보기----");
			String searchPostSql = "SELECT * FROM posts WHERE user_id= ? AND deleted_at IS Null";
			stmt = conn.prepareStatement(searchPostSql);

			System.out.print("UserId : ");
			stmt.setInt(1, Integer.parseInt(br.readLine()));
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("-----".repeat(10));
				System.out.println(
					rs.getString("user_id") + "\t" +
					rs.getString("content") + "\t" +
					rs.getString("image") + "\t" 
				);
			}
// -------------------------------------------------------------------
// -------------------게시물 삭제----------------------------------------
			System.out.println("----게시물 삭제----");
			String deleteSql = "UPDATE posts SET deleted_at = now() WHERE id = ? AND deleted_at IS Null";
			stmt = conn.prepareStatement(deleteSql);
			
			System.out.print("PostId : ");
			stmt.setInt(1, Integer.parseInt(br.readLine()));
			
			int deletePostRow = stmt.executeUpdate();
			System.out.println(deletePostRow + "개의 게시물이 삭제되었습니다.");
// -------------------------------------------------------------------			
// -------------------------------------------------------------------
		// 연결 실패
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
