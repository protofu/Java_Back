package com.oop.inheritance02;

public class Child extends Parents{
	private String job = "개발자";

	void hello() {
		System.out.println("hi");
	}

	@Override
	public void eat() {
		System.out.println("냄냄");
	}
	
	@Override
	public void walk() {
		System.out.println("벅벅뚜뚜");
	}
	
	public String getJob() {
		return this.job;
	}
	
	
	
}
