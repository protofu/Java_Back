package com.oop.interface01;

public interface RemoteControl {
	// 공용 정적 상수 필드
	public static final int MAX_VOL = 10;
	int MIN_VOL = 0;
	
	// public 추상 메서드
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
}
