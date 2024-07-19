package com.math;

public class MathExample {
	public static void main(String[] args) {
		// Math 쿨래스 (인스턴스 생성 불가)
		int a = -10;
		double b = -3.14;
		System.out.println("a 절대값 : " + Math.abs(a));
		System.out.println("b 절대값 : " + Math.abs(b));
		
		double c = 7.8;
		double d = -8.4;
		System.out.println("c 올림 : " + Math.ceil(c));
		System.out.println("b 올림 : " + Math.ceil(d));
		System.out.println("c 내림 : " + Math.floor(c));
		System.out.println("b 내림 : " + Math.floor(d));
		System.out.println("c 반올림 : " + Math.round(c));
		System.out.println("b 반올림 : " + Math.round(d));
		
		double e = 16.0;
		int f = 2;
		int g = 3;
		System.out.println("e의 제곱 : " + Math.sqrt(e));
		System.out.println("f의 g제곱 : " + Math.pow(f, g));
		
		int h = 10;
		int i = 20;
		System.out.println("최대값 : " + Math.max(h, i));
		System.out.println("최소값 : " + Math.min(h, i));
//		
//		System.out.println("0과 1미만 사이의 랜덤 : " + Math.random());
//		System.out.println("0과 10미만 사이의 랜덤 : " + Math.random()*10);
//		System.out.println("0과 47미만 사이의 랜덤 : " + Math.random()*47);
		System.out.println("0과 47미만 사이의 정수 랜덤 : " + ((int) (Math.random()*46)+1))  ;

	}
}
