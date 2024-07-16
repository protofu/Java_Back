package com.oop.inheritance;

public class FlyExample {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.setFlyMode(SuperSonicAirplane.SUPERSONIC);
		sa.fly();
		sa.land();
	}
}
