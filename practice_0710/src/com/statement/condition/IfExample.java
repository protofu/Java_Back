package com.statement.condition;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score >= 60) {
			System.out.println("축하축하");
			System.out.println("합격합격");
		} 
		
		if (score < 60) {
			System.out.println("불합불합");
		}
		
	}
}
