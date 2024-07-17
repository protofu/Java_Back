package com.oop.interface06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run(new KumhoTire(), new HankookTire());
		myCar.run(new KumhoTire(), new KumhoTire());
		
	}
}
