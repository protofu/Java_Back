package com.stream2;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<Student> sList = Arrays.asList(
				new Student("권지훈", 90),
				new Student("박진국", 80),
				new Student("정서연", 85),
				new Student("홍다희", 95)
		);
		
		double avg = sList.stream()
				.mapToInt(Student :: getScore)
				.average()
				.getAsDouble();
		
		System.out.println("평균점수 : " + avg);
	}
}
