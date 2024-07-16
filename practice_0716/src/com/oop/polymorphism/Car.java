package com.oop.polymorphism;

public class Car {
	private Tire tire;
	
	public Tire getTire() {
		return tire;
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void drive() {
		if (tire instanceof HankookTire hk) {
//			HankookTire hk = (HankookTire) tire;
			System.out.println(hk.hankookStyle);
		}
		tire.roll();
	}
}
