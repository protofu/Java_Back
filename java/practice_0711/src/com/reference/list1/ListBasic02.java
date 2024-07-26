package com.reference.list1;

public class ListBasic02 {
	public static void main(String[] args) {
		int[] score = { 100, 70, 75, 43, 96 };
		int sum = 0;
		for(int i=0; i<score.length;i++) {
			sum += score[i];
		}
		System.out.println(sum);
	}
}
