package com.stream11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("박명수", 60));
		stuList.add(new Student("유재성", 100));
		stuList.add(new Student("정준하", 40));
		
		stuList.stream()
			.sorted()
			.forEach(System.out :: print);
		System.out.println();
		stuList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out :: print);
	}
}
