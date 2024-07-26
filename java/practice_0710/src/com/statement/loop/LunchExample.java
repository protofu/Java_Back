package com.statement.loop;

public class LunchExample {
	public static void main(String[] args) {
		String[] lunch = {"칼국수", "보쌈도시락", "김찌", "불백", "중식"};
		int num = ((int) (Math.random() * 120))%5;
		System.out.println("오늘 점심은 : " + lunch[num]);

	}
}
