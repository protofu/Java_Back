package com.reference.list1;

public class ListPractice04 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum = 0;
		for (int i = 0; i < arr.length; i+=2) {
			sum += arr[i+1];
		}
		System.out.println(sum);
	}
}
