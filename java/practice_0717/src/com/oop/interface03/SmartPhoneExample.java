package com.oop.interface03;

public class SmartPhoneExample {
	public static void main(String[] args) {
		PhoneService ps = new SmartPhone();
		ps.turnOn();
		ps.turnOff();
		ps.call("휘뚜루마뚜루");
//		ps.openApp("안될껄 ㅋ");
		SmartService ps_ss = (SmartService) ps;
		ps_ss.openApp("바꿔서 이제 될껄 ㅋ");
		
		System.out.println();
		
		
		SmartService ss = new SmartPhone();
//		ss.turnOn();
//		ss.turnOff();
//		ss.call("휘뚜루마뚜루");
		ss.openApp("될껄 ㅋ");
		
		System.out.println();
		
		SmartPhone sp = new SmartPhone();
		sp.turnOn();
		sp.turnOff();
		sp.call("휘뚜루마뚜루");
		sp.openApp("다 될껄 ㅋ");
	}
}
