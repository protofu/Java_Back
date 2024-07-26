package com.oop.basic.practice03;

public class AccountExample {
	public static void main(String[] args) {
		Account a1 = new Account("441-0290-1203", 500000, 7.3);
		a1.withdraw(600000);
		a1.deposit(20000);
		System.out.println("이자: "+a1.calculateInterest());
	}
}
