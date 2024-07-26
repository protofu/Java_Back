package com.statement.condition;

import java.util.Scanner;

public class SwitchExample03 {
	public static void main(String[] args) {
//		char grade = (char) ((Math.random() * 6) + 'A');
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하세요: ");
		char grade = sc.nextLine().charAt(0);
		
		switch(grade) {
			case 'A' | 'a' -> {
				System.out.println("훌륭합니다.");
				break;
			}
			case 'B' | 'b' -> {
				System.out.println("좋아요.");
				break;
			}
			case 'C' | 'c' -> {
				System.out.println("나쁘지 않아.");
				break;
			}
			case 'D' | 'd' -> {
				System.out.println("별론데.");
				break;
			}
			case 'E' | 'e' -> {
				System.out.println("어우.");
				break;
			}
			case 'F' | 'f' -> {
				System.out.println("저리가.");
				break;
			}
			default -> {
				System.out.println("잘못된거같아");
			}
		}
		
		
	}
}
