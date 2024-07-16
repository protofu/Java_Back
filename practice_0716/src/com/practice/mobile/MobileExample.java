package com.practice.mobile;

public class MobileExample {
	public static void main(String[] args) {
		Mobile ltab = new Ltab("Ltab", 500, "AP-01");
		Mobile otab = new Otab("Otab", 1000, "AND-20");
		
		System.out.println("\nMobile\t\tBattery\t\tOS");
		System.out.println("======".repeat(10));
		System.out.println(ltab);
		System.out.println(otab);
		
		// 10분 충전
		System.out.println("\n10분 충전");
		ltab.charge(10);
		otab.charge(10);
		
		System.out.println("\nMobile\t\tBattery\t\tOS");
		System.out.println("======".repeat(10));
		System.out.println(ltab);
		System.out.println(otab);
		
		// 5분 통화(사용)
		System.out.println("\n5분 통화(사용)");
		ltab.operate(5);
		otab.operate(5);
		
		System.out.println("\nMobile\t\tBattery\t\tOS");
		System.out.println("======".repeat(10));
		System.out.println(ltab);
		System.out.println(otab);
	}
}
