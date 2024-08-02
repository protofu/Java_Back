package com.algo.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int q = Integer.parseInt(st.nextToken());
		int[][] arr = new int[q][5];
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String num = st.nextToken();
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(String.valueOf(num.charAt(j)));
			}
			arr[i][3] = Integer.parseInt(st.nextToken());
			arr[i][4] = Integer.parseInt(st.nextToken());
		}
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
		br.close();
	}
}
