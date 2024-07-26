package com.oop.inheritance03;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("월! 월! 월요일! 싫어!");
	}
	
	public void bite() {
		System.out.println("기가 바이트! 메가 바이트!");
	}
	
}
