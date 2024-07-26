package com.statement.condition;

import java.util.Scanner;

public class IfExample03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("90점 A급 축하");
		} else if (score >= 80) {
			System.out.println("80점 B급 축하");
		} else if (score >= 70) {
			System.out.println("70점 C급 축하");
		} else if (score >= 60) {
			System.out.println("60점 D급 축하");
		} else {
			System.out.println("F급 저리가");
		}
		
	}
}
