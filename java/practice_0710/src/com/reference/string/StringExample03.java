package com.reference.string;

public class StringExample03 {
	public static void main(String[] args) {
		String address = "kim@java.co.kr";
		String userId = address.substring(0, 3);
		String companyName = address.substring(4, 8);
		String domainAddr = address.substring(4);

		System.out.println("uesrId : " + userId);
		System.out.println("companyName : " + companyName);
		System.out.println("domainAddr : " + domainAddr);
	}
}
