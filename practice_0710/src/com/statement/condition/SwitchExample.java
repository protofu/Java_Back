package com.statement.condition;

public class SwitchExample {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 30) + 71;
		System.out.println("점수 : " + score);
		
		String grade = "F";
		
		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade = "A+";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade = "B+";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade = "C+";
			}
		}
		
		System.out.println("학점 : " + grade);
	}
}
