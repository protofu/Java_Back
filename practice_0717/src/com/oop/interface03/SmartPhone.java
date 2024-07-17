package com.oop.interface03;

public class SmartPhone implements SmartService, PhoneService {

	@Override
	public void turnOn() {
		System.out.println("폰 온!!!!!!!!!!");
		
	}

	@Override
	public void turnOff() {
		System.out.println("폰 옾!!!!!!!!!!!!!!!!!");
	}

	@Override
	public void call(String number) {
		System.out.println(number + "에 전화 거는중");
	}

	@Override
	public void openApp(String appName) {
		System.out.println(appName + "을/를 실행!!!!!!!!!");		
	}

	
}
