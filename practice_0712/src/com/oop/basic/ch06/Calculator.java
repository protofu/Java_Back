package com.oop.basic.ch06;

public class Calculator {
	boolean power;
	
	void powerOff() {
		System.out.println("전원 컷");
		this.power = false;
	}

	void powerOn() {
		System.out.println("전원 살림");
		this.power = true;
	}
	
	int plus(int x, int y) {
		return power ? x + y : null;
	}
	
	double divide(double x, double y) {
		return power ? x / y : null;
	}
	
	// multiple
	// substract
	
	int multiple(int x, int y) {
		return power ? x * y : null;
	}
	
	int substract(int x, int y) {
		return power ? x - y : null;
	}
	
	int sum1(int ... values) {
		int result = 0;
		for (int i : values) {
		result += i;
		}
		return result;
		}
	double sum2(double ... values) {
		double result = 0;
		for (double i : values) {
		result += i*1_000_000_000;
		}
		return result/1_000_000_000;
		}
	
	
}
