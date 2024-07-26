package com.lambda3;

public class PersonExample {
	public static void main(String[] args) {
		Person jh = new Person("김하온", "츄레블뤌", "대한민국");
		
		jh.action((name, job) -> {
			System.out.println("안녕! 날 소개하지 내이름은 " + name);
			System.out.println("직업은 " + job);
		});
		jh.action2((nation) -> {
			if (jh.getNation().equals("대한민국")) {
				System.out.println("터텨 터뤕");				
			} else {
				System.out.println("법ㅂ법ㅂ법법걱버거버걱ㄱ");
			}
			
		});
	}
}
