package com.stringbuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("자바바자바바자바");
		System.out.println(sb);
		sb.insert(6, "나나");
		System.out.println(sb);
		sb.delete(9, 10);
		System.out.println(sb);
		sb.replace(2, 3, "ㅋ");		
		System.out.println(sb);
		
	}
}
