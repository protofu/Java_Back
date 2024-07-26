package com.reference.list1;

public class ListBasic05 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println("\n");
		
		arr1[0] = 1;
		arr1[1] += 2;
		arr1[2] -= 3;
	
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
	}
	

}
