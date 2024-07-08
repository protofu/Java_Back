package com.practice08;

import java.util.Scanner;

public class OperationExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("한 글자만 입력 : ");
//		String str = sc.nextLine();
//		char c = str.charAt(0);
//		
//		if ((65 <= c) && (c <= 90)) {
//			System.out.println("대문자입니다.");
//		} else if ((97 <= c) && (c <= 122)) {
//			System.out.println("소문자입니다!");
//		} else if ((48 <= c) && (c <= 57)) {
//			System.out.println("숫자입니다 허허!");
//		}
		System.out.print("숫자 하나 써주셈 >> ");
		int i = sc.nextInt();
		
		// 만약 i가 2의 배수이거나 3의 배수ㅎ라면?
		// 2 또는 3의 배수임돠 출력
		
		if (i%2 == 0 || i%3 == 0) {
			System.out.println("2 또는 3의 배수임돠 출력");
			if (i%2 == 0 && i%3 == 0) {
				System.out.println("그리고 ㅋㅋㅋ 오 ㅋㅋㅋ 공배수임 ㅋㅋㅋ 2랑 3 ㅋㅋㅋ");
			}
		} else {
			System.out.println("2, 3과 연관 없음 ㅋㅋㅋ");
		}
		
		
	}
}
