package com.object;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("가나쳐켤릿");
		Member m2 = new Member("크런키쳐켤릿");
		Member m3 = new Member("가나쳐켤릿");
		
		if (m1.equals(m2)) {
			System.out.println("m1 - m2는 같다");
		} else {
			System.out.println("m1 - m2는 다르다");
		}
		
		if (m2.equals(m3)) {
			System.out.println("m2 - m3는 같다");
		} else {
			System.out.println("m2 - m3는 다르다");
		}
		
		if (m1.equals(m3)) {
			System.out.println("m1 - m3는 같다");
		} else {
			System.out.println("m1 - m3는 다르다");
		}
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		
		
	}
}
