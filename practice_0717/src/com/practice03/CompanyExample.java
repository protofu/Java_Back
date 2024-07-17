package com.practice03;

import java.util.Scanner;

public class CompanyExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Company c = new Company("KOSTA");
		System.out.println("입사를 축하합니다.");
		for(int i = 0; i<=9;i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("연봉을 입력하세요 : ");
			int money = sc.nextInt();
			c.addEmp(name, money);	
		}
		
		
		System.out.println("1. 연봉 평균 || 2. 연봉 합계 || 3. 연봉에 따른 직원 정보 출력");
		System.out.println("원하는 서비스를 선택하세요 : ");
		int select = sc.nextInt();
		switch (select) {
			case 1 :
				System.out.println(c.calcAvgMon());
				break;
			case 2 :
				System.out.println(c.calcAllMon());
				break;
			case 3 :
				System.out.println("연봉 제한을 입력하세요 : ");
				int salary = sc.nextInt();
				c.getInfo(salary);
				break;
			default :
				System.out.println("잘못된 번호 입력, 시스템 종료");
		}
	}
}
