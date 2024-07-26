package com.util;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;		
		int day = today.get(Calendar.DAY_OF_MONTH);
		int weekInt = today.get(Calendar.DAY_OF_WEEK);
		int amPmInt= today.get(Calendar.AM_PM);
		
		// 스위치 문으로 요일 가져오기
		String week = switch (weekInt) {
			case 2 -> "월";
			case 3 -> "화";
			case 4 -> "수";
			case 5 -> "목";
			case 6 -> "금";
			case 7 -> "토";
			default -> "일";
		};
		

		// 조건문으로 오전 오후 가져오기
		String amPm = switch (amPmInt) {
			case 1 -> "오후";
			default -> "오전";
		};
		
		
		
		
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + week + "요일 " + amPm);
	
	}
}
