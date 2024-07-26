package com.practice05;

public class Practice05 {
	public static void main(String[] args) {
		int var1 = 10;				// long -> ok
		long var2 = 20L;
		int var3 = 2_147_483_647;	// long -> ok
		long var4 = 2147483648L;	// int 범위 초과

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3+1);	// int 범위 초과 연산시 음수화
		System.out.println(var4);
	}
}
