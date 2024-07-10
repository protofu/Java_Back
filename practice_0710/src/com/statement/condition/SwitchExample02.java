package com.statement.condition;

import java.util.Scanner;

public class SwitchExample02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하세요: ");
		String grade = sc.nextLine();
		int score = switch (grade) {
			case "A", "a" -> 100;
			case "B", "b" -> 90;
			case "C", "c" -> 80;
			case "D", "d" -> 70;
			case "F", "f" -> {
				yield 60;
			}
			default -> {
				yield 0;
			}
		};
		
		System.out.println(score);
	}
}
