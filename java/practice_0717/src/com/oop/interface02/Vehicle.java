package com.oop.interface02;

public interface Vehicle {
	int MAX_SPEED = 300;
	
	void start();
	void stop();
	
	default void displaySpeed(int speed) {
		if (speed > MAX_SPEED) {
			System.out.println("삒ㄲㄲ속도위반!!!!!!");
		} else {
			System.out.println("현재 속도 ㅣ: "+ speed + "km/h");
		}
	}
	
	default void doorOpen() {
		System.out.println("문 열림!!!!!!");
		log("7월 17일 문 열림!!!!!!!");
	}
	
	static void service() {
		System.out.println("6개월 단위로 서비스 점검 받으셈!");
	}
	
	private void log(String msg) {
		System.out.println("log : " +msg);
	}
}
