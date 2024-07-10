package com.statement.practice;

public class practice06 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			String check = "";
			if (i%3==0) {
				check = " three";
			}
			if (i%5==0) {
				check += " five";
			}
			if (i%7==0) {
				check += " seven";
			}
			System.out.println(i + check);
		}
	
	}
}
