package com.exception;

public class ExceptionExample05 {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (NullPointerException e) {
			System.out.println("null값 입력함");
		} catch (ClassNotFoundException e) {
			System.out.println("we cant found class about that");
		}
	}
	private static void findClass() throws ClassNotFoundException, NullPointerException{
		String className = null;
		Class.forName(className.substring(1));
	}
}
