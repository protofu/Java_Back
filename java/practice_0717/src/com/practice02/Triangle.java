package com.practice02;

public class Triangle extends Shape implements Resize{

	Triangle() {}

	Triangle(String color, int width, int height) {
		super(color, width, height);
	}

	@Override
	double getArea() {
		double res = getWidth() * getHeight() * (0.5);
		return res;
	}

	@Override
	public void setResize(int size) {
		setHeight(getHeight()+size);
	}

}
