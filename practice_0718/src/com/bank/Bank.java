package com.bank;

// 은행 클래스 이다.
public class Bank {
	// 은행 필드 (은행이름)
	private String name;
	private Account[] accounts;
	private int total_account_count = 0;
	private static final int MAX_ACCOUNT_COUNT = 10;
	
	// 은행 생성자(Bank(String name){}
	public Bank(String name) {
		this.name = name;
		this.accounts = new Account[MAX_ACCOUNT_COUNT];
	}
	// 은행은 최대 10개의 계좌를 가진다.
	public Account OpenAcc() {
		accounts[total_account_count] = new Account();
		Account acc = accounts[total_account_count];
		total_account_count++;
		return acc;
	}	
	// 은행은 계좌 클래스가 있다.
	class Account {
		// 계좌 필드 (잔고 balance, 계좌번호 A1000~A1001, ...A1009)
		private String AccId;
		private int balance = 0;
		
		public Account() {
			this.AccId = "A" + (1000 + Bank.this.total_account_count);
		}
		
		public void deposit(int money) {
			this.balance += money;
		}

		// 계좌 메소드 (잔액 출력 toString, 입금 deposit, 출금 withdraw)
		public void withdraw(int money) {
			if (this.balance >= money) {				
				this.balance -= money;
			} else {
				System.out.println("잔고 부족");
			}
		}

		@Override
		public String toString() {
			return "Account [AccId=" + AccId + ", balance=" + balance + "]";
		}
		
		
	}
	
}
