package com.reference.list1;

public class ListBasic {
	public static void main(String[] args) {
		int[] intArr1 = { 1, 2, 3 };
		
		String[] strArr1 = { "유재석", "김종국", "지석진" };
		
		int intArr2[] = { 4, 5, 6 };
		String strArr2[] = { "하하", "개리", "이광수" };
		
		strArr2[1] = "양세찬";
		
		strArr2[2] = "송지효";
		
		for (int i = 0; i < strArr2.length; i++) {
			String name = strArr2[i];
			System.out.println(name);
		}
	}
}
