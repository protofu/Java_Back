package com.oop.static_member;

public class StaticExample {
	String instanceField = "hello";
	void instanceMethod() {
		System.out.println("인스턴스 메서드를 호출합니다.");
		System.out.println("인스턴스 필드 : " + instanceField);
	}
	public static void main(String[] args) {
		StaticExample se = new StaticExample();
		System.out.println(se.instanceField);
		se.instanceMethod();
	}
}
