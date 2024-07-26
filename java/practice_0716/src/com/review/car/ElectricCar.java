package com.review.car;

public class ElectricCar extends Car {
	private int batteryCapacity;
	
	public ElectricCar(String brand, String model, int year, int batteryCapacity) {
		super(brand, model, year);
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public void printCarInfo() {
		System.out.println("Brand: "+getBrand()+", Model: "+getModel()+", Year: "+getYear()+", BatteryCapacity: "+batteryCapacity);
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return super.getBrand();
	}

	@Override
	public void setBrand(String brand) {
		// TODO Auto-generated method stub
		super.setBrand(brand);
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return super.getModel();
	}

	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}

	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return super.getYear();
	}

	@Override
	public void setYear(int year) {
		// TODO Auto-generated method stub
		super.setYear(year);
	}
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
}
