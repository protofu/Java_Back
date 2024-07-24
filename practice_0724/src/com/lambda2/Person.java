package com.lambda2;

public class Person {
	public Member getMember1(Creatable1 c) {
		// 아이디를 가지고 멤버를 생성	
		String id = "썸머엉~";
		Member m = c.create(id);
		return m;
	}
	public Member getMember2(Creatable2 c) {
		// 아이디와 이름을 가지고 멤버를 생성 및 변환
		String id = "썸머엉~";
		String name = "쉄머";
		Member m = c.create(id, name);
		return m;
	}
}
