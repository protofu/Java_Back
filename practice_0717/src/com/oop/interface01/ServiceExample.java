package com.oop.interface01;

public class ServiceExample {
	public static void main(String[] args) {
		Service.staticMethod1();
		Service.staticMethod2();
		
		Service s = new ServiceImpl();
		s.defaultMethod1();
		s.defaultMethod2();
		s.abstractMethod();
	}
}
