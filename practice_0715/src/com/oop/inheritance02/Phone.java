package com.oop.inheritance02;

public class Phone {
	public String model, color;
	
	Phone() {
		System.out.println("Phone 기본 생성자");
	}

	Phone(String model, String color) {
		System.out.println("Phone 기본 생성자(모델, 색상)");
		this.model = model;
		this.color = color;
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("본인 : "+ message);
	}
	
	public void receive(String message) {
		System.out.println("상대방 : "+message);
	}
	
	public void hangup() {
		System.out.println("전화를 끊습니다.");
	}
}
