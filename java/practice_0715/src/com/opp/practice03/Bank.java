package com.opp.practice03;

public class Bank {
	public static void main(String[] args) {
		Account acc = new Account(10000);
		acc.info(); // 현재 잔고: 10000원 출력
		
		acc.withdraw(10000); // 10000원 출금
		acc.info();
		
		acc.deposit(2_000_000); // 2백만원 입금(금액초과)
		acc.info();
		
		acc.deposit(50_000); // 50000원 입금
		acc.info();
		
	}
}
