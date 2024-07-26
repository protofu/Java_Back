package com.a;

public class ClassName {
	byte byteValue;
	short shortValue;
	int intValue;
	
	public int publicField = 1;
	int defaultField = 1;
	private int privateField = 1;
	
	public void publicMethod() {}
	void defaultMethod() {}
	private void privateMethod() {}
	
	
	public ClassName() {
		publicField = 2;
		defaultField = 2;
		privateField = 2;

		publicMethod();
		defaultMethod();
		privateMethod();
	}
	
	
	public ClassName(byte byteValue) {
		this.byteValue = byteValue;
	}
	
	ClassName(short shortValue) {
		this.shortValue = shortValue;
	}
	
	private ClassName(int intValue) {
		this.intValue = intValue;
	}
	// public -> 전체
	ClassName cn1 = new ClassName(1);
	// default -> 같은 패키지 내
	ClassName cn2 = new ClassName(1);
	// private -> 같은 객체 내
	ClassName cn3 = new ClassName(1);
}

