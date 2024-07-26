package com.stream9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamFilterExample2 {
	public static void main(String[] args) {
		// 1부터 1000까지 숫자 생성
		List<Integer> primeList = IntStream.rangeClosed(1, 1000)
				.filter(x -> isPrime(x))
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println(primeList);
		System.out.println();
		
		// 1부터 5까지 IntStream 생성... doubleStream타입으로 변환후 출력
		IntStream
			.range(1, 6)
			.asDoubleStream()
			.forEach(System.out :: println);

		
		// 1부터 5까지 IntStream 생성... double타입의 리스트로 변환후 출력
		List<Double> dList = IntStream
			.range(1, 6)
			.asDoubleStream()
			.boxed()
			.collect(Collectors.toList());
		
		System.out.println(dList);
	}
	
	static boolean isPrime(int i) {
		if (i<2) return false;
		for(int n=2;n<=Math.sqrt(i);n++) {
			if (i%n==0) {
				return false;
			}
		}
		return true;
	};
	
	static boolean isEven(int i) {
		if(i%2==0) 
		return true;
		return false;
	};
}
