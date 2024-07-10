package com.reference.string;

public class StringExample04 {
	public static void main(String[] args) {
		String lyrics = "떳다 떳다 비행기 날아라 날아라";

		int flyIndex = lyrics.indexOf("날아라");

		System.out.println(flyIndex + "번째 글자 : " + lyrics.charAt(flyIndex));

		int highIndex = lyrics.indexOf("높이");

		if (highIndex == -1) {
			System.out.println("없는 글자입니다.");
		}
	}
}
