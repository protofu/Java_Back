package com.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		System.out.println(dtf.format(now));
		
		LocalDateTime minus3Weeks = now.minusWeeks(1471);
		System.out.println(dtf.format(minus3Weeks));
		
		LocalDateTime plus100days = now.plusDays(99);
		System.out.println(dtf.format(plus100days));
	}
}
