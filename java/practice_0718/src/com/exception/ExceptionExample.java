package com.exception;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자 하나를 골라서 100에다가 나눌거임
		final int H = 100;

		while (true) {
			System.out.print("수 입 력(종료를 원하면 '종료' 입력) : ");
			String input = sc.next();

			if (input.equals("종료")) {
				break;
			}
			try {
				int number = Integer.parseInt(input);
				int rlt = divide(H, number);
				System.out.println(rlt);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나누지 마세요~");
			} catch (Exception e) {
				System.out.println("뭘 입력한거야 ㅋㅋㅋㅋ");
			}
		}
		sc.close();
	}
	
	private static int divide(int x, int y) throws ArithmeticException {
		int rlt = x / y;
		return rlt;
	}
}
