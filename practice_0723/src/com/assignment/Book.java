package com.assignment;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
	private String title, author;
	private int year, pages;
}
