package com.reference.list1;

import java.util.Scanner;

public class ListPractice02 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i+1 + "번째 점수를 입력하세요");
//			score[i] = Integer.parseInt(sc.next());
			score[i] = 3;
		}
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		double avg = sum / score.length;
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
	}
}
