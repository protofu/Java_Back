package com.stream5;

import java.util.stream.IntStream;

public class StreamExample {
	public static void main(String[] args) {
		// 특정 범위의 정수 스트림을 만들기
		int sum = IntStream.range('A', 'Z').sum();
		System.out.println(sum);
		int sum2 = IntStream.rangeClosed('A', 'Z').sum();
		System.out.println(sum2);
		
		
	}
}
