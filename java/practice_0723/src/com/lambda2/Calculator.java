package com.lambda2;

import java.util.Scanner;

public class Calculator {
	public void calculate(Calculable calc) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int x = sc.nextInt();
		System.out.print("\n숫자 입력 : ");
		int y = sc.nextInt();
		
		int answer = calc.calculate(x, y);
		System.out.println(answer);
	}
}
