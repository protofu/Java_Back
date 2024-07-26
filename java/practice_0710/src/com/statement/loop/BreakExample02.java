package com.statement.loop;

public class BreakExample02 {
	public static void main(String[] args) {
		for (char upper = 'ㄱ'; upper <= 'ㅎ'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'c') {
					break;
				}
			}
		}
	}
}
