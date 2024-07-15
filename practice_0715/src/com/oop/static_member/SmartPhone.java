package com.oop.static_member;

public class SmartPhone {
	static String company = "Apple";
	static String model = "iPhone16";
//	static String info = company + "-" + model;
	static String info;
	static {
		System.out.println("클래스가 메모리로 로딩될 때 자동 실행");
		info = company + "-" + model;
	}
}
