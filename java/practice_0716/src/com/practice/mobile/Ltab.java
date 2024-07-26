package com.practice.mobile;

public class Ltab extends Mobile {
	
	public Ltab() {

	}
	
	public Ltab(String mobileName, int batteySize, String osType) {
		super(mobileName, batteySize, osType);
	}

	@Override
	public int operate(int time) {
		int res = 10 * time;
		setBatteySize(getBatteySize()-res);
		return getBatteySize();
	}

	@Override
	public int charge(int time) {
		int res = 10 * time;
		setBatteySize(getBatteySize()+res);
		return getBatteySize();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
