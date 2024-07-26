package com.oop.practice;

public class Member {
	public String name, id, password;
	int age;
	
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setId(String id) {
		this.id = id;
	}
}
