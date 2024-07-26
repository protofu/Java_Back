package com.statement.practice;

public class practice02 {
	public static void main(String[] args) {
		int i = 0, j = 0;
		while (i <= 10) {
			j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
