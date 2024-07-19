package com.algo.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10001];
		
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i<n;i++) {
			int num = Integer.parseInt(reader.readLine());
			arr[num]++;
		}
		
		for (int i=0;i<10001;i++) {
			for (int j=0;j<arr[i];j++) {
				System.out.println(i);
			}
		}
		
	}

}
