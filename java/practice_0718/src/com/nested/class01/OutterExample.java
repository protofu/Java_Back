package com.nested.class01;

public class OutterExample {
	public static void main(String[] args) {
		Outter o = new Outter();
		o.useOutter();
		o.useInner();
		
		Outter.Inner i = o.new Inner();
		i.useInner();
		i.useOutter();
	}
}
