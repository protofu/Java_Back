package com.statement.loop;

public class LunchExample {
	public static void main(String[] args) {
		String[] lunch = {"냉면", "칼국수", "햄버거", "김찌", "불백", "순두부"};
		int num = ((int) (Math.random() * 120))%6;
		System.out.println("오늘 점심은 : " + lunch[num]);

	}
}
