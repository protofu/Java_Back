package com.statement.loop;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		while (i <= 100) {
			sum += i++;
		}
		System.out.println(sum);
	}
}
