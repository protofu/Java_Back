package com.practice08;

public class OperationExample {
	public static void main(String[] args) {
		int x = 10, y = 10, z;
		x++;
		++x;
		System.out.println("x : " + x);
		
		System.out.println("--------------");
		y--;
		--y;
		System.out.println("y : " + y);
		
		System.out.println("--------------");
		z = x++;
		System.out.println("x : " + x);
		System.out.println("z : " + z);

		System.out.println("--------------");
		z = ++x;
		System.out.println("x : " + x);
		System.out.println("z : " + z);

		System.out.println("--------------");
		z = ++x + y++;
		System.out.println("x : " + x);
		System.out.println("x : " + y);
		System.out.println("z : " + z);
	}
}
