package com.generic;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.content = "hi";
		box.content = 10;
		box.content = new Member("ㅎㅋ", 20);
		
		Object content = box.content;
		System.out.println(content);
	}
}
