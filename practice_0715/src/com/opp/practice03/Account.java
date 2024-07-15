package com.opp.practice03;

public class Account {
	private int balance;
	
	final int MAX_ACC = 1_000_000;
	
	Account(int money) {
		setBalance(money);
	}
	
	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int b) {
		if (balance + b > MAX_ACC) {
			System.out.println("최대 잔고 초과");
		} else {
			this.balance += b;
		}
		
	}

	public void info() {
		System.out.println("현재 잔고: "+balance);
	}

	public void withdraw(int money) {
		if (balance - money < 0 && money > 0) {	
			System.out.println("잔액 부족으로 출금 불과");
		} else {
			setBalance(-money);
		}
	}

	public void deposit(int money) {
		setBalance(money);
	}

}
