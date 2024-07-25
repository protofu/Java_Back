package com.stream02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatchExample {
	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6, 8, 10 };
		int[] intArr2 = { 2, 3, 4, 6, 8 };
		
		// 모두 2의 배수이면 true
		boolean isAllEven = Arrays.stream(intArr).allMatch(i -> i%2==0);
		System.out.println("1번 배열 짝수 : " + isAllEven);
		
		boolean isAllEven2 = IntStream.of(intArr2).allMatch(i -> i%2==0);
		System.out.println("2번 배열 짝수 : " + isAllEven2);
		// 하나라도 2의배수면 true
		boolean isAnyEven = Arrays.stream(intArr).anyMatch(i -> i%2==0);
		System.out.println("1번 배열 짝수 : " + isAnyEven);
		
		boolean isAnyEven2 = IntStream.of(intArr2).anyMatch(i -> i%2==0);
		System.out.println("2번 배열 짝수 : " + isAnyEven2);
		// 하나라도 홀수 true
		boolean isAnyOdd = Arrays.stream(intArr).anyMatch(i -> i%2==1);
		System.out.println("1번 배열 홀수 : " + isAnyOdd);
		
		boolean isAnyOdd2 = IntStream.of(intArr2).anyMatch(i -> i%2==1);
		System.out.println("2번 배열 홀수 : " + isAnyOdd2);
		// 10의 배수가 없으면 true
		boolean isNoneTen = Arrays.stream(intArr).noneMatch(i -> i%10 == 0);
		System.out.println("1번 배열 10배수 : " + isNoneTen);
		
		boolean isNoneTen2 = IntStream.of(intArr2).noneMatch(i -> i%10 == 0);
		System.out.println("2번 배열 10배수 : " + isNoneTen2);
	}
}
