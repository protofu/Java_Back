package com.oop.basic.ch03;

public class Car {
	String model = "그랜저";
	int speed = 300;
	boolean start;
	Tire tire = new Tire();

	// 기본 생성자
	// Car() {}
	public Car(String m, int sp, boolean st) {
		model = m;
		speed = sp;
		start = st;
	}
}
