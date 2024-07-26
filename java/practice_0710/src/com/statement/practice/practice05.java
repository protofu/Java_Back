package com.statement.practice;

import java.util.Scanner;

public class practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1자리 수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = num; i<=100; i+=num) {
			sum += i;			
		}
		System.out.println(sum);
	}
}
