package com.exception;

public class ExceptionExample01 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength("yoyoyoyoyoyo!");
		printLength("yoyoyo!");
		printLength("yoyoyoyo!");
		printLength(null);
		printLength("yoyoyoyoyo!");
		System.out.println("프로그램 종료");
	}

	private static void printLength(String str) {
		
		try {
			int len = str.length();
			System.out.println("글자수 : " + len);			
		} catch (NullPointerException e) {
			// 예외 출력 방법 3가지
//			e.printStackTrace(); ->> 예외 프린트
//			System.err.println(e.getMessage());
//			System.err.println(e.toString());
		}
	}
}
