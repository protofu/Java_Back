package com.nested.class01;

public class A {
	// 인스턴스 필드
	int number = 1;
	B b = new B(); // 중첩 클래스를 인스턴스 필드로 사용
	C c = new C(); // 중첩 클래스를 인스턴스 필드로 사용
	D d = new D(); // 중첩 클래스를 인스턴스 필드로 사용
	// 정적 필드
	static int totalNumber = 0;

	// 기본 생성자
	A() {
		B b = new B(); // 중첩 클래스를 생성자 내부에서 사용
		C c = new C(); // 중첩 클래스를 생성자 내부에서 사용
		D d = new D(); // 중첩 클래스를 생성자 내부에서 사용
	}

	// 메서드
	void hello() {
		B b = new B(); // 중첩 클래스를 메서드 내부에서 사용 (로컬 클래스)
		C c = new C(); // 중첩 클래스를 메서드 내부에서 사용 (로컬 클래스)
		D d = new D(); // 중첩 클래스를 메서드 내부에서 사용 (로컬 클래스)
		System.out.println("Hello");
	}

	// 정적 메서드
	static void staticHello() {
		System.out.println("Hello");
	}

	// 중첩 클래스
	public class B {
		// 어디서든 사용 가능한 B 클래스
		// 필드, 생성자, 메서드
		// 원래는 정적 필드와 정적 메서드는 올 수 없다.
		// Java17 이후부터 정적 필드와 메서드는 올 수 있다;;;;;
	}

	class C {
		// 같은 패키지에서만 사용가능한 C 클래스
	}

	private class D {
		// 여기 A 클래스 안에서만 사용가능한 D 클래스
	}
}
