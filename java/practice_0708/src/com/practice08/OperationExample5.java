package com.practice08;

import java.util.Scanner;

public class OperationExample5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력 : ");
		int score = sc.nextInt();
		// 만약 90점 초과 => 수
		// 80점 초과 => 우
		// 70점 초과 => 미
		// 60점 초과 => 양
		// 나머지 => 가
//		switch (score) {
//			case 1: score = 90; 
//				System.out.println("수");
//				break;
//			case score > 80:
//				System.out.println("우");
//			case score > 70:
//				System.out.println("미");
//			case score > 60:
//				System.out.println("양");
//			default :
//				System.out.println("가");
//		}
		char grade = (score > 90) ? 'A'
				: (score > 80) ? 'B'
				: (score > 70) ? 'C'
				: (score > 60) ? 'D'
				: 'F';
		System.out.println(score + "점은 " + grade + "등급입니다.");
				
		
		
	}
}
