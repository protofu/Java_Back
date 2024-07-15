package com.oop.inheritance02;

public class SmartPhone extends Phone {
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		// 없어도 괜찮지만 명시해줄 수 있음
		super(model, color);
		System.out.println("SmartPhone 생성자");
		System.out.println("model : "+ super.model);
		System.out.println("color : "+ super.color);
//		this.model = model;
//		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		if (wifi) {
			System.out.println("와이파이 ON");
		} else {
			System.out.println("와이파이 down");
		}
		this.wifi = wifi;
	}
	
	public void internet() {
		System.out.println("인터넷 connected");
	}
}
