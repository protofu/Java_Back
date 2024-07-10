package com.practice;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.print("2. 정수를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("3. 정수를 입력하세요.");
		int num3 = sc.nextInt();
		int miNum = num1 > num2 ? num1 : num2;
		System.out.println(miNum > num3 ? miNum : num3);
	}
}
