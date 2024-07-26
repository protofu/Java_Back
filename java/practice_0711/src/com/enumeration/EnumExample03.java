package com.enumeration;

import java.util.Calendar;

public class EnumExample03 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		Week todayWeek = switch(week) {
		case 1 -> Week.SUNDAY;
		case 2 -> Week.MONDAY;
		case 3 -> Week.TUESDAY;
		case 4 -> Week.WEDNESDAY;
		case 5 -> Week.THURSDAY;
		case 6 -> Week.FRIDAY;
		case 7 -> Week.SATURDAY;
		default -> null;
		};
		
		if (todayWeek == Week.SUNDAY) {
			System.out.println("쉼");
		} else {
			System.out.println("공부");
		}
	}
}
