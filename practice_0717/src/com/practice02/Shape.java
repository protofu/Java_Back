package com.practice02;

public abstract class Shape {
	private String color;
	private int width, height;
	
	Shape() {}

	Shape(String color, int width, int height) {
		super();
		this.color = color;
		this.width = width;
		this.height = height;
	}
	
	abstract double getArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
