package com.oop.basic.practice01;

public class Student {
	String name;
	int k_score;
	int e_score;
	int m_score;
	int s_score;

	Student(String name, int k_score, int e_score, int m_score, int s_score) {
		this.name = name;
		this.k_score = k_score;
		this.e_score = e_score;
		this.m_score = m_score;
		this.s_score = s_score;

	}

	double getAvg() {
		int sum = k_score + e_score + m_score + s_score;
		double avr = sum / 4.0;
		return avr;
	}

	String getGrade() {
		double avr = getAvg();
		String grade = switch ((int) avr / 10) {
			case 10, 9 -> "A";
			case 8, 7 -> "B";
			case 6, 5 -> "C";
			case 4, 3 -> "D";
			default -> "F";
		};
		return grade;
	}
}
