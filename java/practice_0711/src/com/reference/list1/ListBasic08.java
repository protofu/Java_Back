package com.reference.list1;

//import java.util.*;

public class ListBasic08 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		int[] score = {1, 2, 3, 4, 5};
		
		int sum = 0;
		
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
		
		for(int s: score) {
			sum += s;
		}
		
		double avg = sum / score.length;
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
	}
	

}
