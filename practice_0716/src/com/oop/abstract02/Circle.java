package com.oop.abstract02;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	 double calcArea() {
		return radius*radius*Math.PI;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("(장) 원형입니다.");
	}

}
