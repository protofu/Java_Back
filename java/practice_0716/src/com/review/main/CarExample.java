package com.review.main;

import com.review.car.Car;
import com.review.car.ElectricCar;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car("타요", "버스", 2021);
		Car c2 = new Car("또봇", "로봇", 2015);
		ElectricCar ec = new ElectricCar("큐브", "큐빅스", 2005, 25);
		
		c1.printCarInfo();
		c2.printCarInfo();
		
		ec.printCarInfo();
		
		System.out.println("총 차량 수 : " + Car.getCarCount());
	}
}
