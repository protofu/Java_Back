package com.oop.basic.ch06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// 전원 켬
		calc.powerOn();
		
		int plus = calc.plus(5, 6);
		System.out.println(plus);
		
		double devide = calc.divide(5, 3);
		System.out.println(devide);

		int mul = calc.multiple(5, 3);
		System.out.println(mul);
		
		int sub = calc.substract(5, 3);
		System.out.println(sub);
		
		int sumR = calc.sum1(new int[] {1, 2, 3, 4,5 ,6,7});
		System.out.println(sumR);

		double sumR2 = calc.sum2(new double[] {1.05, 2.5, 3.14});
		System.out.println(sumR2);
		
		
		
		calc.powerOff();
	}
}
