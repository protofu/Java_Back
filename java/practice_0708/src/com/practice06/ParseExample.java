package com.practice06;

public class ParseExample {
	public static void main(String[] args) {
		String strByte = "10";
		byte byteValue = Byte.parseByte(strByte);
		
		short shortValue = Short.parseShort(strByte);
		
		String strInt = "200";
		int intValue = Integer.parseInt(strInt);
		
		String x = "10";
		String y = "20";
		
		System.out.println(x + y);
		
		int xValue = Integer.parseInt(x);
		int yValue = Integer.parseInt(y);
		System.out.println(xValue + yValue);
	}
}
