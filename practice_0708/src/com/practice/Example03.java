package com.practice;

public class Example03 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90) ? true : false; 
		System.out.println(b); // true
	}
}
