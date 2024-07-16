package com.oop.abstract02;

public abstract class Shape {
	// 추상 메서드
	abstract double calcArea();
	
	// 일반 메서드
	public void display() {
		System.out.println("이것은 도형입니다.");
	}
}
