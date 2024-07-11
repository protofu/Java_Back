package com.reference.list1;

public class ListBasic06 {
	public static void main(String[] args) {
		int[] arr1 = {0, 0, 0};
		int[] arr2 = {1, 2, 3};
		int[] arr3 = {4, 5, 6};
		
		int[][] arr4 = {arr1, arr2, arr3};
		System.out.println(arr4[2][2]);
		
		int[][] arr5 = {{0, 0, 0}, {1, 2, 3}, {4, 5, 6}};
		System.out.println(arr5[2][2]);
		
		// {{0, 0}, {0, 0}, {0, 0}, {0, 0}}
		int[][] arr6 = new int[4][2];
		System.out.println(arr6);
		
		// {{0, 0, 0}, {0, 0}, {0, 0, 0}}
		int[][] arr7 = new int[3][];
		arr7[0] = new int[3];
		arr7[1] = new int[2];
		arr7[2] = new int[3];
		System.out.println(arr7);
		
		
	}
	

}
