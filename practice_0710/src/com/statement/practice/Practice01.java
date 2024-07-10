package com.statement.practice;

public class Practice01 {
	public static void main(String[] args) {
		// 1~20까지 중 2배수 아니고 3배수 아닌 수 총합
		int sum = 0;
		for(int i=1;i<21;i++) {
			if (i%2 == 0 || i%3 == 0) continue;
			sum += i;
		}
		System.out.println(sum);
	}
}
