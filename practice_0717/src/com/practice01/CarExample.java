package com.practice01;

public class CarExample {
	public static void main(String[] args) {
		Car l3 = new L3("L3", "1500", 50, 25, 0);
		Car l5 = new L5("L5", "2000", 70, 35, 0);

		Car[] car = {l3, l5};
		
		System.out.println("\n vehicleName\t engineSize\t oilTank\t oilSize\t distance\t temperature");
		System.out.println("=======".repeat(15));
		for(Car c : car) {
			System.out.println(c);
		}
		
		System.out.println("\n vehicleName\t engineSize\t oilTank\t oilSize\t distance\t temperature");
		System.out.println("=======".repeat(15));
		for(Car c : car) {
			c.setOil(25);
			System.out.println(c);
		}
	
		System.out.println("\n vehicleName\t engineSize\t oilTank\t oilSize\t distance\t temperature");
		System.out.println("=======".repeat(15));
		for(Car c : car) {
			c.go(80);
			System.out.println(c);
		}
		
	}
}
