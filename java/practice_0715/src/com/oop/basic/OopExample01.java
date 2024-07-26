package com.oop.basic;

public class OopExample01 {
	public static void main(String[] args) {
		Korean k1 = new Korean("김밥", "991212-1245367");
		System.out.println("이름 "+k1.name);
		System.out.println("성별 "+k1.gender);
		System.out.println("연도 "+k1.birthYear);
		System.out.println("월 "+k1.birthMonth);
		System.out.println("일 "+k1.birthDay);
		System.out.println(Korean.nation);
	}
}
