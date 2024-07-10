package com.reference.string;

public class StringExample02 {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍 : 자바라는 언어를 배웁니다.";
		String subject2 = subject.replace("자바", "잡아");
		String subject3 = subject.replaceFirst("자바", "잡아");
		
		System.out.println(subject);
		System.out.println(subject2);
		System.out.println(subject3);
		
	}
}
