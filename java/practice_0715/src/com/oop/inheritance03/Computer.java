package com.oop.inheritance03;

public class Computer extends Calculator {

	@Override
	public double getCircleArea(double r) {
		System.out.println("Computer 객체에서 원 넓이 구하기.");
		return Math.PI * r * r;
	}

}
