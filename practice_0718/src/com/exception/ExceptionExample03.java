package com.exception;

public class ExceptionExample03 {
	public static void main(String[] args) {
		String[] classArr = { "java.lang.String", null, "ㅋㄷㅋㄷ", "java.lang.String" };
		for (String s : classArr) {
			try {
				Class.forName(s);
				System.out.println(s + "이 존재!");

			} catch (ClassNotFoundException e) {
				System.out.println("클래스 음슴");
			} catch (NullPointerException e) {
				System.out.println("널널하네~");
			} catch (Exception e) {
				System.out.println("모르겠네~");
			}
		}
		System.out.println("프로그램 오프!!!!!!!!");
		System.out.println();

	}
}
