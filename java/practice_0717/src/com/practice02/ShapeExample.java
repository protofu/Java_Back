package com.practice02;

public class ShapeExample {
	public static void main(String[] args) {
		
		Shape[] sArr = new Shape[6];
		sArr[0] = new Triangle("Blue", 7, 5);
		sArr[1] = new Rectangle("Blue", 4, 6);
		sArr[2] = new Triangle("Red", 6, 7);
		sArr[3] = new Rectangle("Red", 8, 3);
		sArr[4] = new Triangle("White", 9, 8);
		sArr[5] = new Rectangle("White", 5, 7);

		for (Shape s : sArr) {
			if (s instanceof Triangle) {
				System.out.println("Triangle" + "\t\t"+s.getArea() +"\t\t"+ s.getColor());
			} else {
				System.out.println("Rectangle" + "\t\t"+s.getArea() +"\t\t"+ s.getColor());
			}
			
		}
		System.out.println();
		for (Shape s : sArr) {
			if (s instanceof Triangle t) {
				t.setResize(5);
				System.out.println("Triangle" + "\t\t"+s.getArea() +"\t\t"+ s.getColor());
			} else if(s instanceof Rectangle r) {
				r.setResize(5);
				System.out.println("Rectangle" + "\t\t"+s.getArea() +"\t\t"+ s.getColor());
			}
			
			
		}
	}
}
