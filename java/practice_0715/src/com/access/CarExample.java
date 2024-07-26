package com.access;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("JACK");
		myCar.info();
		
		myCar.setSpeed(2000);
		myCar.info();
		
		myCar.setSpeed(145);
		myCar.info();
	
		System.out.println(5 * myCar.getSpeed());
	}
}
