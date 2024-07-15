package com.oop.inheritance;

public class Child extends Parents {
	String job = "개발자";
	
	void hello( ) {
		System.out.println("안녕하세요");
	}
	
	@Override
	void walk() {
		System.out.println("뚜벅뚜벅");
	}
}
