package com.nested.class01;

public class AExample {
	public static void main(String[] args) {
		// 외부에서 중첩 인스턴스 클래스를 생성하기 위해서는, 바깥 클래스(객체)를 생성 후 중첩 클래스를 생성
		A a = new A();
		A.B b = a.new B();
	}
}
