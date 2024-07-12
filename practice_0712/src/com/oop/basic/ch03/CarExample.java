package com.oop.basic.ch03;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("페라뤼", 200, true);
		System.out.println("모델명 :" + myCar.model);
		System.out.println("시동 여부 :" + myCar.start);
		System.out.println("현재 속도 :" + myCar.speed);
		myCar.start = true;
		myCar.speed = 30;
		System.out.println("시동 여부 :" + myCar.start);
		System.out.println("현재 속도 :" + myCar.speed);
	}
}
