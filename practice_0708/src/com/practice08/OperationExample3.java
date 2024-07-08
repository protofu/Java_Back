package com.practice08;

import java.util.Scanner;

public class OperationExample3 {
	public static void main(String[] args) {
		System.out.println('A' == 65);
		System.out.println('A' < 66);
		
		System.out.println(3 == 3.0);
		
		System.out.println(0.1 == 0.1f);
		System.out.println(0.1 < 0.1f);
		System.out.println((float) 0.1 == 0.1f);
		
		// 문자열 비교는 비교연산자 사용이 불가능하다
		// 참조 데이터 타입은 값이 아닌 메모리 주소를 비교하기 때문에
		String name1 = "김밥";
		String name2 = "김밥";
		String name3 = "김";
		System.out.println(name1 == name2);
		System.out.println(name1 == (name3+"밥"));
		
		//따라서 문자열 비교는 비교연산자 대신 equals(), !equals() 사용
		System.out.println(name1.equals(name3+"밥"));
		
		Scanner sc = new Scanner(System.in);
		String target = "HELLO";
		System.out.print("문자 입력 >> ");
		String input = sc.nextLine();
		
		System.out.println("target과 input의 연산자 비교 : " + (target == input));
		System.out.println("target과 input의 메서드 비교 : " + (target.equals(input)));
	}
}
