package com.algo.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split("\\.");
//		for (String s : arrList) {
//			System.out.println(s);
//		}
		System.out.println(Arrays.toString(arr));
	}

}
