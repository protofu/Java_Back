package com.practice06;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);

		intValue = 100;
		long floatValue = intValue;
		System.out.println("longValue: " + floatValue);

		intValue = 50;
		long doubleValue = intValue;
		System.out.println("longValue: " + doubleValue);
	}
}
