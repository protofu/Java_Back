package com.reference.list1;

import java.util.Scanner;

public class ListPractice07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("개수 입력 : ");
		int n = sc.nextInt();
		double[] a = new double[n];
		double sum = 0, avr = 0;
		for (int i=0;i<n;i++) {
			System.out.println("doubleArr["+i+"] = ");
			a[i] = sc.nextDouble();
			sum += a[i];
		}
		avr = sum / a.length;
		
		System.out.println("합 : "+ sum);
		System.out.println("평균 : "+ avr);
	}
}
