package com.oop.practice05.library.main;

import com.oop.practice05.library.book.Book;
import com.oop.practice05.library.book.EBook;

public class BookExample {
	// 0 Book 클래스와 EBook 클래스를 사용하여 책과 전자책 관리
	// 0 Book 클래스는 제목, 저자, ISBN을 포함( String title, author, isbn)
	// 0 정적 멤버 변수를 통해 총 도서 수를 관리
	
	// 0 EBook 클래스는 추가적으로 파일 크기를 포함(double fileSize)
	// 0 상속과 오버라이딩을 사용하여 EBook 클래스가 Book 클래스의 메소드 확장
	// 0 void printBookInfo() {}
	// 0 BOOK -> "Title: " + title + ", Author: " + author + ", ISBN: " + isbn
	// 0 EBOOK -> "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", File Size: " + fileSize + " MB"
	
	public static void main(String[] args) {
		// Book 인스턴스 생성
		Book book1 = new Book("삼국지", "이문열", "1234567890");
		Book book2 = new Book("갈매기의 꿈", "리처드바크", "0987654321");
		// EBook 인스턴스 생성
		EBook ebook1 = new EBook("소설가 구보씨의 일일", "최인훈", "1122334455", 1.5);

		// 정보출력
		book1.printBookInfo();
		book2.printBookInfo();
		ebook1.printBookInfo();
		
		// 총 도서 수 출력
		System.out.println("총 도서 수 : " + Book.getBookCount());
	
	}
		
}
