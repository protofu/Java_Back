package com.practice02;

public class Rectangle extends Shape implements Resize{
	Rectangle() {}
	
	
	Rectangle(String color, int width, int height) {
		super(color, width, height);
	}


	@Override
	double getArea() {
		double res = getWidth() * getHeight();
		return res;
	}


	@Override
	public void setResize(int size) {
		setWidth(getWidth()+size);
	}
	
	

}
