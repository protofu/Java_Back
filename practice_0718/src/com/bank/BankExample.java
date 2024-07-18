package com.bank;

public class BankExample {
	public static void main(String[] args) {
		Bank b = new Bank("국민");
		Bank.Account acc1000 = b.OpenAcc();
		
		acc1000.deposit(100000);
		System.out.println(acc1000);
		acc1000.deposit(100000);
		System.out.println(acc1000);
		acc1000.withdraw(10000);
		System.out.println(acc1000);
		acc1000.withdraw(1000000);
		System.out.println(acc1000);
	}
}
