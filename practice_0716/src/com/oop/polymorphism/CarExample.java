package com.oop.polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car c = new Car();
		c.setTire(new Tire());
		c.drive();
		
		System.out.println();
		
		c.setTire(new HankookTire());
		c.drive();
		
		System.out.println();
		
		c.setTire(new KumhoTire());
		c.drive();
	}
}
