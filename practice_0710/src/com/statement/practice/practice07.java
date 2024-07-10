package com.statement.practice;

import java.util.Scanner;

public class practice07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num <= 0) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if (num <=0) {
				System.out.println("양수만 입력하세요");
			}
		}
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
