package com.reference.basic;

public class ReferenceExample {
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		int[] arr4 = {1, 2, 3};
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr4);
	}
}
