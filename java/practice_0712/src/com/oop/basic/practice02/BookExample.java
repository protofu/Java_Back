package com.oop.basic.practice02;

public class BookExample {
	public static void main(String[] args) {
		Book b1 = new Book("SQL Plus", 50000, 5.0);
		Book b2 = new Book("Java17\t", 40000, 3.0);
		Book b3 = new Book("JSP Servlet", 60000, 6.0);
		
		Book[] books = { b1, b2, b3 };
		
		System.out.println("책 이름"+"\t\t"+"가격"+"\t"+"할인율"+"\t"+"할인후금액");
		System.out.println("---------------------------------------------");
		
		for(Book book : books) {
			System.out.println(book.bookName+"\t"+book.bookPrice+"원\t"+book.bookDiscountRate+"%\t"+book.getDiscountBookPrice()+"원");
		}
		
		
	}
}
