package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
	private List<Book> books;
	
	public BookManager() {
		this.books = new ArrayList<Book>();
	}
	
	// void addBook(Book book)
	// books에 book 추가
	
	// void removeBook(Book book)
	// books에 book 제거
	
	// void sortBooksBy(Comparator<Book> comparator)
	// 해당 comparator에 따라 정렬
	
	// Stack<Book> getStack()
	// 스택을 생성하여, Books의 book들을 모두 스택에 넣고 반환
	
	// Queue<Book> getQueue()
	// 큐를 생성하여, Books의 book들을 모두 큐에 넣고 반환
	
	// Map<String, Book> getBookMap()
	// HashMap을 생성하여, Books의 book들을 모두 맵<제목, Book>에 넣고 반환
	
	// TreeMap<String, Book> getBookTreeMap()
	// TreeMap을 생성하여, Books의 book들을 모두 트리맵<제목, Book>에 넣고 반환
	
	// TreeSet getBookTreeSet()
	// TreeSet을 생성하여, Books의 book들을 모두 트리셋<Book>에 넣고 반환
}
