package com.oop.basic;

public class Korean {
	static String nation;
	String name;
	String gender = "남자";
	int birthYear;
	int birthMonth;
	int birthDay;

	Korean() {
	}

	Korean(String name, String id) {
		this.name = name;

		String[] ids = id.split("-");

		if (Integer.parseInt(ids[1].substring(0, 1)) % 2 == 0) {
			this.gender = "여자";
		}
		if (Integer.parseInt(ids[0].substring(0, 2)) > 24) {
			this.birthYear = 1900 + Integer.parseInt(ids[0].substring(0, 2));
		} else {
			this.birthYear = 2000 + Integer.parseInt(ids[0].substring(0, 2));
		}
		
		this.birthMonth = Integer.parseInt(ids[0].substring(2, 4));
		this.birthDay = Integer.parseInt(ids[0].substring(4, 6));
	}
}
