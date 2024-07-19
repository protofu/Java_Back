package com.object;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "길도이");
		Student s2 = new Student(1, "길도이");
		Student s3 = new Student(1, new String("길도이"));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
