package com.oop.interface02;

public class Car implements Vehicle {
	private int speed;
	
	@Override
	public void start() {
		System.out.println("출빠알!!!!!!!!!!!!!");
		speed = 10;
	}

	@Override
	public void stop() {
		System.out.println("끼이이이이읶!!!!!!!!!!");
		speed = 0;
		System.out.println("현잭속도 ; " + speed);
	}
	
	public void accelerate(int increment) {
		speed += increment;
		displaySpeed(speed);
	}

}
