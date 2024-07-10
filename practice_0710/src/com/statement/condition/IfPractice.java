package com.statement.condition;

public class IfPractice {
	public static void main(String[] args) {
		String id = "990101-1234567";		
		int genderNumber = Integer.parseInt(id.substring(7, 8));
		int genderNumber2 = id.charAt(7)-0;
		switch (genderNumber%2) {
			case 0:
				System.out.println("여자");
				break;
			default:
				System.out.println("남자");
				break;
		}
	}
}
