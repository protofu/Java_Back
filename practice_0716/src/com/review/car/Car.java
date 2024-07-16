package com.review.car;

public class Car {
	private String brand, model;
	private int year;
	protected static int carCount;
	
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		carCount++;
	}

	public void printCarInfo() {
		System.out.println("Brand: "+brand+", Model: "+model+", Year: "+year);		
	}

	public static int getCarCount() {
		return carCount;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
	
}
