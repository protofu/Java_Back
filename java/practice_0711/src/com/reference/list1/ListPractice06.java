package com.reference.list1;

import java.util.Arrays;

public class ListPractice06 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for (int i=0; i<10; i++) {
			arr[i] = 1 + (int) (Math.random()*10);
			sum += arr[i];
			System.out.println(i + "번째 값 = " + arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		double avr = sum / 10.0; 
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avr);
	}
}
