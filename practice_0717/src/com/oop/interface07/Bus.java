package com.oop.interface07;

public class Bus implements Vehicle{

	public void checkFare() {
		System.out.println("돈.");
	}
	
	@Override
	public void run() {
		System.out.println("버스 런!!!!!!!!");
	}

}
