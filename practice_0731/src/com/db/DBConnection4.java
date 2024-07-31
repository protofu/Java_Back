package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.User;

public class DBConnection4 {
	public static Connection conn = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	public static Scanner sc = new Scanner(System.in);
	public static int resultRow = 0;
	public static String sql = "";
	public static int post_id = 0;
	
	public static void addUser() throws SQLException {
		// 회원가입
		System.out.println("\n ===================== 회원가입 =====================");
		sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
		
		String[] userInfo = new String[3];
		System.out.print("이름 입력 : ");
		userInfo[0] = sc.nextLine();
		System.out.print("이메일 입력 : ");
		userInfo[1] = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		userInfo[2] = sc.nextLine();
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userInfo[0]);
		pstmt.setString(2, userInfo[1]);
		pstmt.setString(3, userInfo[2]);
		
		resultRow = pstmt.executeUpdate();
		System.out.println(resultRow + "개의 회원정보가 추가되었습니다.");
	}
	
	public static List<User> getAllUsers() throws SQLException {
		// 회원 전체 조회
		System.out.println("\n ===================== 회원 전체 조회 =====================");
		sql = "SELECT * FROM users WHERE deleted_at IS NULL";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		List<User> userList = new ArrayList<>();
		
		System.out.println("id \t name \t email \t password");
		System.out.println("-----------------------------------------------");
		
		while (rs.next()) {
			User u = new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("password"));
			userList.add(u);
		}
		return userList;
	}
	
	public static void addPost() throws SQLException {
		// 게시물 등록 
		System.out.println("\n ===================== 게시글 등록 =====================");
		sql = "SELECT * FROM users WHERE id = ? AND deleted_at IS NULL";
		System.out.print("사용자 아이디 입력 : ");
		int user_id = sc.nextInt();
		sc.nextLine();
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, user_id);
		rs = pstmt.executeQuery();
		
		if (rs.next()) {
			// 사용자 존재
			sql = "INSERT INTO posts (user_id, content, image) VALUES (?, ?, ?)";
			System.out.print("내용 입력 : ");
			String content = sc.nextLine();
			System.out.print("이미지 파일명 입력 : ");
			String image = sc.nextLine();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, user_id);
			pstmt.setString(2, content);
			pstmt.setString(3, image);
			resultRow = pstmt.executeUpdate();
			System.out.println(rs.getString("name") + " 이/가 작성한 " + resultRow + "개의 게시글이 등록되었습니다.");
		} else {
			// 없는 사용자
			System.out.println("탈퇴하였거나 없는 사용자 아이디입니다.");
		}
	}
	
	public static void getAllPosts() throws SQLException {
		// 게시물 전체 보기
		System.out.println("\n ===================== 게시물 전체 보기 =====================");
		sql = "SELECT * FROM posts WHERE deleted_at IS NULL";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		System.out.println("id \t user_id \t content \t image \t created \t updated");
		
		while (rs.next()) {
			System.out.println(
				rs.getInt(1) + " \t " +
				rs.getInt(2) + " \t " +
				rs.getString(3) + " \t " +
				rs.getString(4) + " \t " +
				rs.getDate(5) + " \t " +
				rs.getDate(6)
			);
		}
	}

	public static void modifyPost() throws SQLException {
		// 게시물 수정
		System.out.println("\n ===================== 게시물 수정 =====================");
		sql = "UPDATE posts SET content= ? WHERE id = ? AND deleted_at IS NULL";
		System.out.print("수정할 게시물 번호 : ");
		post_id = sc.nextInt();
		sc.nextLine();
		System.out.print("수정할 게시물 내용 : ");
		String content = sc.nextLine();
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, content);
		pstmt.setInt(2, post_id);
		
		resultRow = pstmt.executeUpdate();
		System.out.println("게시물 " + resultRow + "개가 수정되었습니다.");
		
	}
	
	public static void getPost() throws SQLException {
		// 특정 게시물 조회
		System.out.println("\n ===================== 특정 게시물 조회 =====================");
		sql = "SELECT * FROM posts WHERE id = ? AND deleted_at IS NULL";
		System.out.print("조회할 게시물 번호 : ");
		post_id = sc.nextInt();
		sc.nextLine();
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, post_id);
		rs = pstmt.executeQuery();
		
		System.out.println("id \t user_id \t content \t image \t created \t updated");
		if (rs.next()) {
			System.out.println(
				rs.getInt(1) + " \t " +
				rs.getInt(2) + " \t " +
				rs.getString(3) + " \t " +
				rs.getString(4) + " \t " +
				rs.getDate(5) + " \t " +
				rs.getDate(6)
			);
		} else {
			System.out.println("존재하지 않는 게시물 입니다.");
		}
	}
	
	public static void deletePost() throws SQLException {
		// 특정 게시물 삭제
		System.out.println("\n ===================== 특정 게시물 삭제 =====================");
		sql = "UPDATE posts SET deleted_at = now() WHERE id = ? AND deleted_at IS NULL";
		System.out.print("삭제할 게시물 번호 : ");
		post_id = sc.nextInt();
		sc.nextLine();
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, post_id);
		
		resultRow = pstmt.executeUpdate();
		System.out.println("게시물 " + resultRow + "개가 삭제되었습니다.");
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/kostagram";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공");
			
			boolean action = true;
			while (action) {
				System.out.println("1. 회원가입 | 2. 전체 회원조회 | 3. 게시물 전체 조회 | 4. 게시물 등록 | 5. 종료");
				int num = sc.nextInt();
				sc.nextLine();
				switch(num) {
				case 1: addUser(); break;
				case 2: {
					List<User> allUsers = getAllUsers();
					allUsers.stream().forEach(u->System.out.println(u.getName()));
					break;
				}
				case 3: {
					getAllPosts();
					System.out.println("---------".repeat(10));
					System.out.println("1. 게시물 수정 | 2. 특정 게시물 조회 | 3. 게시물 삭제");
					int num2 = sc.nextInt();
					sc.nextLine();
					switch(num2) {
						case 1: modifyPost(); break;
						case 2: getPost(); break;
						case 3: deletePost();
						default: break;
					}
					break;
				}
				case 4: addPost(); break;
				default: action = false;
				}
			}			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("DB 오류");
		} finally {
			try {
				if (sc != null) sc.close();
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				System.err.println("객체 종료 실패");
			}
		}
	}
}