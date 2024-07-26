package com.practice01;

public abstract class Car {
	private String name, engine;
	private int oilTank, oilSize, distance;
	
	Car() {}
	
	Car(String name, String engine, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	// 주행
	abstract void go(int distance);
	
	// 주유
	abstract void setOil(int oilSize);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getOilTank() {
		return oilTank;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	@Override
	public String toString() {
		return "\n" + name + "\t\t" + engine + "\t\t" + oilTank + "\t\t" + oilSize
				+ "\t\t" + distance;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}
