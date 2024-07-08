package com.practice07;

import java.util.Scanner;

public class AverageExample {
	public static void main(String[] args) {
		// 3명 수학점수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("1번 수학 점수 : ");
		String math1 = sc.nextLine();
		System.out.print("2번 수학 점수 : ");
		String math2 = sc.nextLine();
		System.out.print("3번 수학 점수 : ");
		String math3 = sc.nextLine();
		
		int score1 = Integer.parseInt(math1);
		int score2 = Integer.parseInt(math2);
		int score3 = Integer.parseInt(math3);
		int all = score1 + score2 + score3;
		double avr = (score1 + score2 + score3) / (double) 3;
		

		System.out.println("평균 점수는 : " + all);
		System.out.println("평균 점수는 : " + avr);
	}
}
