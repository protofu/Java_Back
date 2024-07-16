package com.oop.interface01;

public class RemoteControlExample {
	public static void main(String[] args) {
//		TV tv = new TV();
//		Radio rd = new Radio();
//		tv.turnOn();
//		
		RemoteControl rc = new TV();
		rc.turnOn();
		rc.setVolume(-3);
		
		TV tv = (TV) rc;
		System.out.println(tv.getVolume());
		
		rc.turnOff();
		
		rc = new Radio();
		rc.turnOn();
		rc.setVolume(5);
		
		Radio rd = (Radio) rc;
		System.out.println(rd.getVolume());
		
		rd.turnOff();
	}
}
