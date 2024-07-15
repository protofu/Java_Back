package com.oop.static_member;

public class ClassName {
	String instanceField = "인스턴스";

	void instanceMethod() {
		// 인스턴스 메소드는 객체가 생성된 뒤에 호출!
		// 인스턴스, 정적필드 사용가능
		System.out.println(instanceField);
		System.out.println(staticField);

		instanceField = "instance";
//		staticField = 10; // 정적 필드 값을 변경하는 것은 일반적이지 않다.
		System.out.println(instanceField);
//		System.out.println(staticField);

	}

	static String staticField = "정적";

	static void staticMethod1() {
		// 정적 메소드에서는 인스턴스 멤버(필드, 메소드)를 사용할 수 없다.
		// 정적 메소드에서는 this를 사용할 수 없다.
		// 정적 멤버만 사용 가능
		System.out.println("------------------------");
		System.out.println(staticField);
		staticMethod2();
		
		// 굳이 인스턴스를 사용해야 겠다면, 여기서 생성 사용
		ClassName cn = new ClassName();
		cn.instanceField = "생성 후 사용";
		System.out.println(cn.instanceField);
		cn.instanceMethod();
		System.out.println("------------------------");
	}

	static void staticMethod2() {
		staticField = "static";
	}
}
