package com.generic02;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "Hi";
		String data1 = box1.content;
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int data2 = box2.content;
		
		Box<Member> box3 = new Box<>();
		box3.content = new Member("여기", 14);
		Member data3 = box3.content;
	}
}
