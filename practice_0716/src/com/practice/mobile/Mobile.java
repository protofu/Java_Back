package com.practice.mobile;

public abstract class Mobile {
	private String mobileName, osType;
	private int batteySize;
	
	public Mobile() {
	
	}
	
	public Mobile(String mobileName, int batteySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batteySize = batteySize;
		this.osType = osType;
	}
	
	// 사용을 통해 배터리 감소(분단위)
	public abstract int operate(int time);
	
	// 충전을 통한 배터리 증가(분단위)
	public abstract int charge(int time);

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public int getBatteySize() {
		return batteySize;
	}

	public void setBatteySize(int batteySize) {
		this.batteySize = batteySize;
	}

	@Override
	public String toString() {
		return mobileName + "\t\t" + batteySize + "\t\t" + osType;
	}
	
	
	
}
