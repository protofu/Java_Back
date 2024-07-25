package com.stream03;

import java.util.Arrays;

public class ReductionExample3 {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4 };
		int result1 = Arrays.stream(intArr).reduce((a, b) -> a * b).getAsInt();
		System.out.println("요곱 : "+ result1);

		int result2 = Arrays.stream(intArr).reduce(100, (a, b) -> a * b);
		System.out.println("요곱 : "+ result2);
		
		int result3 = Arrays.stream(intArr).reduce(100, (a, b) -> {
			System.out.println(a);
			System.out.println(b);
			return a * b;
		});
		System.out.println("요곱 : "+ result3);
	}
}
