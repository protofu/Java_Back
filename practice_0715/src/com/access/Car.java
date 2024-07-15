package com.access;

public class Car {
	String name;
	private int speed;
	final int MAX_SPEED = 200;
	
//	Car() {
//		this.name = null;
//		this.speed = 0;
//	}
//	
	Car(String name) {
		this.name = name;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed > 0 && MAX_SPEED > speed ? speed : 0;
	}
	
	void info() {
		System.out.println(name + "의 현재속도: " + speed + "km/h");
	}

	public int getSpeed() {
		return speed;
		
	}
}
