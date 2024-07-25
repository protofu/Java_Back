package com.stream;

import java.util.Arrays;

public class LoopExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		int total = Arrays.stream(intArr)
						.filter(x -> x%2==0)
						.peek(System.out :: println)
						.sum();
		System.out.println("합 -> " + total);
	
		Arrays
			.stream(intArr)
			.filter(x -> x%2==1)
			.forEach(System.out :: println);
	
	}
	
}
