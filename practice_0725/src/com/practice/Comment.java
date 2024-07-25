package com.practice;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comment {
	private int id, postId;
	private String title, author;
	private LocalDateTime createdAt;
}
