package com.oop.interface07;

public class DriverExample {
	public static void main(String[] args) {
		Driver james = new Driver();
		james.drive(new Bus());
		james.drive(new Taxi());
	}
}
