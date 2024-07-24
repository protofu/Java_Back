package com.assignment;

import java.util.Comparator;

public class BookComparator {


	// static Comparator<Book> byTitle()
	// 제목을 기준으로 정렬
	public static Comparator<Book> byTitle() {
//		return new Comparator<Book>() {	
//			@Override
//			public int compare(Book o1, Book o2) {
//				// TODO Auto-generated method stub
//				return o1.getTitle().compareTo( o2.getTitle());
//			}
//		};
		return Comparator.comparing(Book :: getTitle);
	}
	// static Comparator<Book> byAuthor()
	// 글쓴이를 기준으로 정렬
	public static Comparator<Book> byAuthor() {
//		return new Comparator<Book>() {	
//			@Override
//			public int compare(Book o1, Book o2) {
//				// TODO Auto-generated method stub
//				return o1.getAuthor().compareTo( o2.getAuthor());
//			}
//		};
		return Comparator.comparing(Book :: getAuthor);
	}
	// static Comparator<Book> byYear()
	// 출판연도를 기준으로 정렬
	public static Comparator<Book> byYear() {
//		return new Comparator<Book>() {	
//			@Override
//			public int compare(Book o1, Book o2) {
//				return o1.getYear()-o2.getYear();
//			}
//		};
//		return Comparator.comparing(Book :: getYear);
		return Comparator.comparing((book) -> book.getYear());
	}
	// static Comparator<Book> byPages()
	// 총 페이지를 기준으로 정렬
	public static Comparator<Book> byPages() {
//		return new Comparator<Book>() {	
//			@Override
//			public int compare(Book o1, Book o2) {
//				// TODO Auto-generated method stub
//				return o1.getPages()-o2.getPages();
//			}
//		};
		return Comparator.comparing(Book :: getPages);
	}
	

	

}
