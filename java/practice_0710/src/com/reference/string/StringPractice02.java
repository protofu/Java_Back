package com.reference.string;

import java.util.Scanner;

public class StringPractice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 초기 입력하기
		System.out.println("\"-\"를 포함해서 주민번호를 입력하세요");
		System.out.print("주민번호 입력 : ");
		String id = sc.nextLine();
		boolean check = true;
		check = id.substring(6, 7).equals("-");
		
		// 14자리가 맞을때까지 && - 입력 할때까지 입력받기
		while (id.length() != 14 || check == false) {
			if (id.length() != 14) {
				System.out.println("자릿수가 틀렸습니다.");	
			}
			if (!check) {
				System.out.println("\"-\"를 포함시키라고 했잖아요.");
			}
			System.out.println("다시입력하세요 : ");
			id = sc.nextLine();
			check = id.substring(6, 7).equals("-"); 
			
		}
		System.out.println("입력 -> " + id.substring(0,6) + " - " + "*******");
		
		// 각 문자열중 해당 속성만 뽑아서 정수화
		int year = Integer.parseInt(id.substring(0, 2));
		int month = Integer.parseInt(id.substring(2, 4));
		int gender = Integer.parseInt(id.substring(7, 8));
		
		// 분류를 넣을 문자열 생성, 기본값 지정
		String mon, gen = "여자", ye = "19"+ year;
		
		// 태어난 해 4자리로 만들기
		if (year <= 24) {
			ye = "20" + year;
		}
		
		// 각 월별 계절 넣기
		switch (month) {
		case 12, 1, 2:
			mon = "겨울";
			break;
		case 3, 4, 5:
			mon = "봄";
			break;
		case 6, 7, 8:
			mon = "여름";
			break;
		case 9, 10, 11:
			mon = "가을";
		default:
			mon = "언제 태어난지도 모르냐";
		}
		
		// 성별 설정
		if (gender%2 == 1) {
			gen = "남자";
		}
		sc.close();
		System.out.println(ye + " - " + mon + " - " + gen);
	}
}
