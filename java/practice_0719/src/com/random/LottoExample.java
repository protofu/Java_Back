package com.random;

import java.util.Arrays;
import java.util.Random;

public class LottoExample {
	public static void main(String[] args) {
		int[] selectNum = new int[6];
		Random r = new Random();
		int cnt = 0;
		while(cnt != 6) {
			int num = r.nextInt(46)+1;
			boolean check = true;
			for (int i = 0; i < cnt; i++) {
				if (selectNum[i] == num) {
					check = false;
					break;
				}
			}
			if (check) {
				selectNum[cnt] = num;
				cnt++;
			}
		}
		
		System.out.println(Arrays.toString(selectNum));
	}
}
