package com.practice;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.print("2. 정수를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println(num1 > num2 ? num1 : num2);
	}
}
