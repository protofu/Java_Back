package com.oop.inheritance03;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("아이폰13Pro", "블랙");
		
		System.out.println("와이파이 상태: "+sp.wifi);
		
		sp.bell();
		sp.sendVoice("ㅋㅋ");
		sp.receive("웃냐 ㅋ");
		sp.sendVoice("? ㅋ");
		sp.hangup();
		
		sp.setWifi(!sp.wifi);
		sp.internet();
		
	}
}
