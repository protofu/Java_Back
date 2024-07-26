package com.generic03;

public class ProductExample {
	public static void main(String[] args) {
		Product<Car, String> carPrd = new Product<>();
		carPrd.setKind(new Car());
		carPrd.setModel("테슬라 S");
		
		Product<Television, String> tvPrd = new Product<>();
		tvPrd.setKind(new Television());
		tvPrd.setModel("스탠바이미");
		
		Product<Food, String> foodPrd = new Product<>();
		foodPrd.setKind(new Food());
		foodPrd.setModel("불백");
	}
}
