package com.reference.list1;

import java.util.Arrays;

public class ListBasic10 {
	public static void main(String[] args) {
		int[] arr = {1, 9, 8, 4, 2, 3, 5, 7, 6};
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		String[] arr2 = {"carrot", "apple", "dragon", "banana"};
		Arrays.sort(arr2);
		
		for(String s : arr2) {
			System.out.print(s + " ");
		}
		
	}
	

}
