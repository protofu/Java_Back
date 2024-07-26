package com.oop.abstract02;

public class Rectangle extends Shape {
	private double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width*height;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("사각사각형입니다.");
	}
}
