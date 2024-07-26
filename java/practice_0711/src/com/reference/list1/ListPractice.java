package com.reference.list1;

public class ListPractice {
	public static void main(String[] args) {
		String[] season = { "봄", "여름", "가을", "겨울" };
		
		for (int i = 0; i < season.length; i++) {
			String ss = switch (season[i]) {
			case "봄" -> "Spring";
			case "여름" -> "Summer";
			case "가을" -> "Autumn";
			case "겨울" -> "Winter";
			default -> "몰랑";
			};
			System.out.println(ss);
		}
	}
}
