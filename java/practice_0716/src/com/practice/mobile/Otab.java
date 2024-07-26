package com.practice.mobile;

public class Otab extends Mobile {
	public Otab() {
		// TODO Auto-generated constructor stub
	}

	public Otab(String mobileName, int batteySize, String osType) {
		super(mobileName, batteySize, osType);
	}

	@Override
	public int operate(int time) {
		int res = 12 * time;
		setBatteySize(getBatteySize()-res);
		return getBatteySize();
	}

	@Override
	public int charge(int time) {
		int res = 8 * time;
		setBatteySize(getBatteySize()+res);
		return getBatteySize();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
