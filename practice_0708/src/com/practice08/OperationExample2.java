package com.practice08;

public class OperationExample2 {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		long v3 = 10L;
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);
		long result2 = v1 + v2 - v3;
		System.out.println("result2: " + result2);
		double result3 = (double) v1 / v2;
		System.out.println("result3: " + result3);
		int result4 = v1 % v2;
		System.out.println("result4: " + result4);
	}
}
