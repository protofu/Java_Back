package com.practice;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
	private int id;
	private String title, content, author;
	private LocalDateTime createdAt;
	private List<Comment> comments;
}
