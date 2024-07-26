package com.oop.interface01;

public interface Service {
	default void defaultMethod1() {
		defaultCommon();
		staticMethod1();
		commonMethod();
		System.out.println("디폴트 메소드 1");
	}
	
	String NAME = "인터페이스";
	void abstractMethod();
	
	default void defaultMethod2() {
		defaultCommon();
		staticMethod1();
		commonMethod();
		System.out.println("디폴트 메소드 2");
	}
	
	default void defaultCommon() {
		defaultCommon();
		staticMethod1();
		commonMethod();
		System.out.println("프라이빗 메소드 (디폴트에서만 사용)");
	}
	
	static void staticMethod1() {
		commonMethod();
		System.out.println("퍼블릭 정적 메소드 1");
	}

	static void staticMethod2() {
		commonMethod();
		System.out.println("퍼블릭 정적 메소드 2");
	}
	
	private static void commonMethod() {
		staticMethod1();
		commonMethod();
		System.out.println("프라이빗 정적 메소드");
	}
}
