package com.oop.interface04;

public class InterfaceExample {
	public static void main(String[] args) {
		// 구현 객체(new InterfaceImpl())가 자식 인터페이스에 대입되면, 자식과 부모 추상 메서드 모두 호출 가능
		Child ic = new InterfaceImpl();
		ic.methodM();
		ic.methodF();
		ic.methodC();
		// 구현 객체(new InterfaceImpl())가 부모 인터페이스에 대입되면, 해당 부모 추상 메서드 모두 호출 가능
		Mother im = new InterfaceImpl();
		im.methodM();
		
		Father ifa = new InterfaceImpl();
		ifa.methodF();
		Mother m = (Mother) ifa;
		m.methodM();
		Child c = (Child) ifa;
		c.methodM();
		c.methodC();
		c.methodF();
	}
}
