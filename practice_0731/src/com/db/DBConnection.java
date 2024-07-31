package com.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConnection {
	public static Connection conn = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// 1. JDBC 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB 연결
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kostagram", "root", "1234");
			System.out.println("DB connection comp");
			
//			// statement 생성
////			Statement stmt = conn.createStatement();
//			
//			System.out.print("ID : ");
//			String userEmail = br.readLine();
//
//			System.out.print("Password : ");
//			String userPassword = br.readLine();
////			String sql = "SELECT * FROM users WHERE email ='"+ userEmail +"' AND password ='" + userPassword+"'";
////			ResultSet rs =  stmt.executeQuery(sql);
////			
//			String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, userEmail);
//			pstmt.setString(2, userPassword);
//			
//			ResultSet rs = pstmt.executeQuery();
//			if (rs.next()) {
//				System.out.println(rs.getString("name"));
//			} else {
//				System.out.println("Login Failed");
//			}
			
//			String insertSql = "INSERT INTO users (name, email, password) Values (?, ?, ?)";
//			PreparedStatement pstmt = conn.prepareStatement(insertSql);
//			System.out.print("Name : ");
//			String userName = br.readLine();
//			pstmt.setString(1, userName);
//
//			System.out.print("Email : ");
//			String userEmail = br.readLine();
//			pstmt.setString(2, userEmail);
//
//			System.out.print("Password : ");
//			String userPassword = br.readLine();
//			pstmt.setString(3, userPassword);
//			
//			int insertedRow = pstmt.executeUpdate();
//			System.out.println(insertedRow + " User Added");
			
			
			// 사용자 게시글 작성 (본인)
//			String insertPostSql = "INSERT INTO posts (user_id, content, image) Values (?, ?, ?)";
//			PreparedStatement pstmt = conn.prepareStatement(insertPostSql);
//			System.out.print("User_id : ");
//			String userId = br.readLine();
//			pstmt.setString(1, userId);
//			
//			System.out.print("Content : ");
//			String content = br.readLine();
//			pstmt.setString(2, content);
//			
//			System.out.print("Image : ");
//			String image = br.readLine();
//			pstmt.setString(3, image);
//			
//			int insertedPostRow = pstmt.executeUpdate();
//			System.out.println(insertedPostRow + " Post Added");
			
			
//			// 사용자 게시글 작성
//			// 1. 사용자 아이디 번호 입력 받기
//			System.out.print("사용자 아이디 번호 : ");
//			String user_id = br.readLine();
//			// 2. 사용자 아이디 번호를 통한 사용자 이름 조회
//			PreparedStatement nameStmt = conn.prepareStatement("SELECT name FROM users WHERE id = ?");
//			nameStmt.setString(1, user_id);
//			ResultSet rs = nameStmt.executeQuery();
//			// 3. 사용자 이름 조회 결과가 있으면 해당 블록 실행
//			if(rs.next()) {
//				// 4. 사용자 이름 가져오기
//				String userName = rs.getString("name");
//				// 5. 게시물 작성
//				String insertPostSql = "INSERT INTO posts (user_id, content, image) VALUES (?, ?, ?)";
//				PreparedStatement postStmt = conn.prepareStatement(insertPostSql);
//				// 6. 게시글 내용, 이미지 파일명 입력 받기
//				System.out.print("게시글 내용 : ");
//				String content = br.readLine();
//				System.out.print("게시글 이미지 파일명 : ");
//				String image = br.readLine();
//				// 7. ? 파라미터에 입력 값 대입
//				postStmt.setString(1, user_id);
//				postStmt.setString(2, content);
//				postStmt.setString(3, image);
//				// 8. INSERT 실행 및 결과 출력
//				int insertedRow = postStmt.executeUpdate();
//				System.out.println(userName + "이 작성한 " + insertedRow + "개의 게시글이 추가되었습니다.");
//				// 9. 리소스 종료
//				postStmt.close();
//			} else {
//				// 10.사용자 이름이 조회되지 않는 경우
//				System.out.println("없는 사용자입니다.");				
//			}
//			rs.close();
//			nameStmt.close();
			
//			// 게시글 수정
//			// 1. 특정 게시물 내용 수정하기
//			String updateSql = "UPDATE posts SET content = ? WHERE id = ?";
//			// 2. SQL 통해 PreparedStatement 생성
//			PreparedStatement updateStmt = conn.prepareStatement(updateSql);
//			// 3. 입력을 통해, 수정 내용과 게시물 번호 받아오기
//			System.out.print("수정할 내용 : ");
//			String content = br.readLine();
//			System.out.print("수정할 번호 : ");
//			int postId = Integer.parseInt(br.readLine());
//			// 4. ? 파라미터에 입력 값 대입
//			updateStmt.setString(1, content);
//			updateStmt.setInt(2, postId);
//			// 5. 게시물 수정 실행
//			int updatedRow = updateStmt.executeUpdate();
//			System.out.println(updatedRow + "개의 게시물이 수정되었습니다.");
//			// 6. 리소스 종료
//			updateStmt.close();
			
//			// 게시물 삭제
//			// 1. SQL문 작성
//			String deleteSql = "DELETE FROM posts WHERE id = ?";
//			PreparedStatement deleteStmt = conn.prepareStatement(deleteSql);
//			// 2. 입력받기
//			System.out.print("삭제할 post의 번호 : ");
//			int postId = Integer.parseInt(br.readLine());
//			// 3. ? 파라미터에 입력값 대입
//			deleteStmt.setInt(1, postId);
//			// 4. 삭제 실행
//			int deletedRow = deleteStmt.executeUpdate();
//			System.out.println(deletedRow + "개의 게시물이 삭제되었습니다.");
//			// 5. 리소스 종료
//			deleteStmt.close();			

			// 전체 회원 조회
			String allUserSql = "SELECT * FROM users";
			ResultSet rs = conn.prepareStatement(allUserSql).executeQuery();
			
			while(rs.next()) {
				System.out.println("---------".repeat(5));
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getString("password"));
			}
			rs.close();
			
			br.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc x");
		} catch (SQLException e) {
			System.out.println("DB connection Fail");
		} finally {
			// 3. 연결 종료
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("connection close Failed");
				}
			}
		}
	}
}
