package com.anonymous.implement;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
	System.out.println("텔레비전 온!!!!!!!");	
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전 옾!!!!!!!!");
	}
	
}
