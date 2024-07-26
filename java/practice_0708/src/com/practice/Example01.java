package com.practice;

public class Example01 {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "2";
		boolean bnx = false;
		char c1 = 'A', c2 = 'B', c3 = '1', c4 = '2';
		int inx = 2;
		
		System.out.println(s1+s2); //12
		System.out.println(!bnx); //true
		System.out.println(s1+(inx+inx/inx)+s1); //131
		System.out.println((inx+inx+inx/inx)+s1); //51
		System.out.println(c2 + c2 / inx); //99
	}
}
