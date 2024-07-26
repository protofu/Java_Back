package com.oop.inheritance03;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		Calculator calc = new Calculator();
		System.out.println(calc.getCircleArea(r));
		
		Computer com = new Computer();
		System.out.println(com.getCircleArea(r));
	}
}
