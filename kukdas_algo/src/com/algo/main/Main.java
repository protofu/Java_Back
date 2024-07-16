package com.algo.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int count = 0;
		int count2 = 0;
		int max=0;
		
		for(int i = 0; i<9; i++) {
			for(int j= 0; j<9; j++) {
				arr[i][j]=sc.nextInt();
				if(max<arr[i][j]) {
					max = arr[i][j];
					count = i+1;
					count2 = j+1;
				}
					
				
			}
		}

		System.out.println(max);
		System.out.println(count +" "+count2);
		
	}

}
