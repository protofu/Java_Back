package com.practice08;

import java.util.Scanner;

public class MistakeExample {
	public static void main(String[] args) {
		// 정확한 계산을 위해 실수 연산은 가급적 피하자.
//		Scanner sc = new Scanner(System.in);
//		int apple = 1;
//		double pieceUnit = 0.1;
//		System.out.print("몇 조각? : ");
//		int number = sc.nextInt();
//		
//		double result = apple - number * pieceUnit;
//		System.out.println("사과 1개에서 남은 양 : " + result);
		Scanner sc = new Scanner(System.in);
		int apple = 1;
		double pieceUnit = 10;
		System.out.print("몇 조각? : ");
		int number = sc.nextInt();
		
		double result = apple - (pieceUnit - number) /10.0;
		System.out.println("사과 1개에서 남은 양 : " + result);
	}
}
