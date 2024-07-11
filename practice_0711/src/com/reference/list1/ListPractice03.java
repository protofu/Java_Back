package com.reference.list1;

public class ListPractice03 {
	public static void main(String[] args) {
		String[] subject = { "HTML", "CSS", "JavaScript", "Java", "CS" };
		
		// for 반복 돌리기
		// 반복하면서 Java있으면 출력
		for(String s: subject) {
			if (s.contains("Java") == true) {
				System.out.println(s);
			}
		}
	}
}
