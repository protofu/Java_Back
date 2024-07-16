package com.oop.polymorphism;

public class HankookTire extends Tire {
	
	String hankookStyle = "한국국타타이이어";
	
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
	
}
