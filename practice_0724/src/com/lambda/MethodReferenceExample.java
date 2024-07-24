package com.lambda;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.ordering((String a, String b) -> a.compareTo(b));
		p.ordering(String :: compareTo);
	}
}
