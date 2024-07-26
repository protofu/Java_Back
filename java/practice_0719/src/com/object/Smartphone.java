package com.object;

public class Smartphone {
	private String model, os;
	
	public Smartphone(String model, String os) {
		this.model = model;
		this.os = os;
	}

	@Override
	public String toString() {
		return model + ", " + os;
	}
}
