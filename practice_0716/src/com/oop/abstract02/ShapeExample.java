package com.oop.abstract02;

public class ShapeExample {
	public static void main(String[] args) {
		Shape c = new Circle(5.0);
		Shape r = new Rectangle(4.0, 6.0);
		
		
		c.display();
		System.out.println("원면적 : " + c.calcArea());
		
		System.out.println();
		
		r.display();
		System.out.println("사각면적 : " + r.calcArea());
	}
}
