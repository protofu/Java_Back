package com.oop.basic.practice03;

public class Account {
	String account;
	int balance;
	double interest;
	
	Account() {}
	
	Account(String account, int balance, double interest) {
		this.account = account;
		this.balance = balance;
		this.interest = interest;
		System.out.println("계좌정보: "+account + " " + "현재잔액: "+ balance);
	}
	
	double calculateInterest() {
		double inte = balance*interest / 100;
		return inte;
	}
	
	void deposit(int money) {
		balance += money;
		System.out.println("계좌정보: "+account + " " + "현재잔액: "+ balance);
	}
	
	void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println("계좌정보: "+account + " " + "현재잔액: "+ balance);
		} else {
			System.out.println("출금할 수 없습니다.");	
		}
	}
}
