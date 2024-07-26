package com.lambda;

public class LambdaExample2 {
	public static void main(String[] args) {
		action((x) -> System.out.println("숫자" + x + "를 활용한 동작"));
	}
	public static void action(MyInterface mi) {
		int x = 3;
		mi.action(x);
	}
}
