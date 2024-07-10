package com.statement.loop;

public class ForExample02 {
	public static void main(String[] args) {
		for(int num=1, tNum=1; num<=5; tNum += ++num) {
			System.out.println("수" + num + ", 삼수" + tNum);
		}
	}
}
