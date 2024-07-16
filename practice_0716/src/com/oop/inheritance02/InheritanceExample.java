package com.oop.inheritance02;

public class InheritanceExample {
	public static void main(String[] args) {
		Parents p = new Parents();
		System.out.println(p.getEyeColor());
		p.eat();
		p.walk();
		
		System.out.println();
		
		Child c = new Child();
		System.out.println(c.getEyeColor());
		System.out.println(c.getJob());
		c.eat();
		c.walk();
		c.hello();
		
		System.out.println();
		
		Parents pc = c;
		System.out.println(pc.getEyeColor());
		pc.eat();
		pc.walk();
		
		System.out.println();
		
		Child cc = (Child) pc;
		cc.hello();
	}
}
