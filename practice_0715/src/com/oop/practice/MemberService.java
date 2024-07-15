package com.oop.practice;

public class MemberService {
	
	public boolean login(String id, String pw) {
		if(id.equals("hong") && pw.equals("12345")) {
			return true;
		}
		return false;
	}
	
	
	public void logout(String name) {
		System.out.println(name + "님이 로그아웃 되었습니다.");	
	}



}
