package com.oop.basic.ch01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("변수 s1은 Student 객체를 참조");
		
		Student s2 = new Student();
		System.out.println("변수 s2은 또 다른 Student 객체를 참조");
	}
}
