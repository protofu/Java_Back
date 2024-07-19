package com.wrapper;

public class WrapperExample {
	public static void main(String[] args) {
		// 기본 데이터 타입 선언 및 할당
		int num = 10;
		double dNum = 15.5;
		char ch = 'A';
		
		// 기본 데이터 타입 -> Wrapper 객체로 변환 (Boxing)
		// Integer numWrapper = Integer.valueOf(num);
		// Double dNumWrapper = Double.valueOf(dNum);
		// Character chWrapper = Character.valueOf(ch);
		
		// 기본 데이터 타입 -> Wrapper 객체로 변환 (Auto-Boxing)
		Integer numWrapper = num;
		Double dNumWrapper = dNum;
		Character chWrapper = ch;
		
		// Wrapper 객체 -> 기본 데이터 타입으로 변환 (UnBoxing)
		// int numPrimitive = numWrapper.intValue();
		// double dNumPrimitive = dNumWrapper.doubleValue();
		// char chPrimitive = chWrapper.charValue();
		
		// Wrapper 객체 -> 기본 데이터 타입으로 변환 (Auto-Boxing)
		int numPrimitive = numWrapper;
		double dNumPrimitive = dNumWrapper;
		char chPrimitive = chWrapper;

		
	}
}
