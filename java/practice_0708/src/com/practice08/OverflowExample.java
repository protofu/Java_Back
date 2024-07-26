package com.practice08;

public class OverflowExample {
	public static void main(String[] args) {
		byte byteValue = 127;
		System.out.println(++byteValue);
		System.out.println(--byteValue);
		
		short shortValue = 32767;
		System.out.println(++shortValue);
		System.out.println(--shortValue);
		
		int intValue = 2_147_483_647;
		System.out.println(++intValue);
		System.out.println(--intValue);
		
		long longValue = 9223372036854775807L;
		System.out.println(++longValue);
		System.out.println(--longValue);
		
		byte var1 = 125;
		for (int i = 0; i<5; i++) {
			var1++;
			System.out.println("var1 : " + var1);
		}
	}
}
