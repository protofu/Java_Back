package com.reference.basic;

public class ReferenceExample03 {
	public static void main(String[] args) {
		String[] names = {"김밥", "김치", "꽁치", null};
		
		for(int i=0; i<4; i++) {
			String name = names[i];
			System.out.println(name.charAt(0));
		}
	}
}
