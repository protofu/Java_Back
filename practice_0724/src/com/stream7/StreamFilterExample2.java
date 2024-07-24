package com.stream7;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterExample2 {
	public static void main(String[] args) {
		// 1부터 1000까지 숫자 생성
		List<Integer> numList = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			numList.add(i);
		}
		// 스트림으로 소수만 포함하는 새로운 리스트로 반환
		List<Integer> primeList = numList.stream().filter(i -> isPrime(i)).toList();
		List<Integer> evenList = numList.stream().filter(i -> i%2==0).toList();
		// 필터링된 새로운 리스트를 출력
		System.out.println(primeList);
		System.out.println(evenList);
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
