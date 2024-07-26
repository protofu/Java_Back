package com.oop.basic.practice02;

public class Book {
	String bookName;
	int bookPrice;
	double bookDiscountRate;
	
	
	Book() {}

	Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	double getDiscountBookPrice() {
		double payMoney = bookPrice * (100-bookDiscountRate) / 100;
		return payMoney;
	}
	
}
