package com.stream8;

import java.util.Arrays;
import java.util.List;

public class MappingExample {
	public static void main(String[] args) {
		List<Student> sList = Arrays.asList(
			new Student("보라돌이", 90),	
			new Student("뚜비", 80),	
			new Student("나나", 85),	
			new Student("뽀오", 95)	
		);
		
		sList
			.stream()
			.map(Student :: getName)
			.forEach(System.out :: println);
	}
}
