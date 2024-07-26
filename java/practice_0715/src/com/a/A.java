package com.a;

class A {
	public static void main(String[] args) {
		byte byteValue=1;
		short shortValue=1;
		int intValue=1;
		
		ClassName cn1 = new ClassName(byteValue);
		ClassName cn2 = new ClassName(shortValue);
//		ClassName cn3 = new ClassName(intValue);

		ClassName cn = new ClassName();
		// 다른 패키지에서 필드 호출
		System.out.println(cn.publicField);
		System.out.println(cn.defaultField);
//		System.out.println(cn.privateField);
		// 다른 패키지에서 매서드 호출
		cn.publicMethod();
		cn.defaultMethod();
//		cd.privateMethod();
	}

}
