package com.collection.map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Comparable<Book>{
	private String title, isbn;
	private int year;
	
	@Override
	public int compareTo(Book o) {
		// return Integer.valueOf(this.year).compareTo(o.getYear());
		// 제목 글자수 오름차순 정렬
		// 제목 가져오기
		Integer titleLength = this.getTitle().length();
		Integer otherTitleLength = o.getTitle().length();
		return titleLength.compareTo(otherTitleLength);
	}
}
