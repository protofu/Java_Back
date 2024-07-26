package com.oop.inheritance02;

public class Parents {
	private String eyeColor = "갈색";

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void eat() {
		System.out.println("냠냠");		
	}

	public void walk() {
		System.out.println("뚜뚜뻒뻒");		
	}
}
