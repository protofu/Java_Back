package com.reference.basic;

public class ReferenceExample04 {
	public static void main(String[] args) {
		String name1 = "곽도팔";
		String name2 = "곽도팔";
		String name3 = new String("곽도팔");
		String name4 = new String("곽도팔");
	
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name4));
		System.out.println(name2.equals(name3));
		System.out.println(name2.equals(name4));
		System.out.println(name3.equals(name4));
	}
}
