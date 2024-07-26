package com.oop.interface05;

public class Phone implements PhoneService{

	@Override
	public void turnOn() {
		System.out.println("전화 온!!!!!!!!");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전화 옾!!!!!!!!");
		
	}

	@Override
	public void call(String number) {
		System.out.println(number + "에 전화거는중!!!!!!!!!");
		
	}

}
