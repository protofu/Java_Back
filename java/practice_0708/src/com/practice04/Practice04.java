package com.practice04;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 5;
		int tmp;
		System.out.printf("x : %d, y : %d\n", x, y);
		tmp = x;
		x = y;
		y = tmp;
		System.out.printf("x : %d, y : %d", x, y);
	}

}
