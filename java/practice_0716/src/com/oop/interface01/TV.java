package com.oop.interface01;

public class TV implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("티삐 온!!!!!!!!!!!!!!!!!");
	}

	@Override
	public void turnOff() {
		System.out.println("티삐 옾쁘!!!!!!!!!!!!!!!!!!");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOL) {
			this.volume = RemoteControl.MAX_VOL;
		} else if (volume < RemoteControl.MIN_VOL) {
			this.volume = RemoteControl.MIN_VOL;
		} else {
			this.volume = volume;
		}		
	}

	public int getVolume() {
		return volume;
	}

}
