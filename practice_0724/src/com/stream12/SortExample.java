package com.stream12;

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
		.sorted((s1, s2) -> s1.getScore() - s2.getScore())
		.forEach(System.out :: print);
	}
}
