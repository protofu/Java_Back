package com.practice08;

public class ExceptionExample {
	public static void main(String[] args) {
//		int exception = 5 / 0;
		double infinity = 5 / 0.0;
		System.out.println(infinity);
		
		double notANumber = 5 % 0.0;
		System.out.println(notANumber);
		
		if (!Double.isInfinite(infinity)) {
			double result1 = ++infinity;
			System.out.println(result1);	
		} else if (!Double.isNaN(notANumber)) {
			double result2 = ++notANumber;
			System.out.println(result2);
		}
		
	}
}
