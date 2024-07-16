package com.practice.vehicle;

public class VehicleTest {
	public static void main(String[] args) {
		Truck car = new Truck(1000, 100, 5);
		
		System.out.println("최대적재중량 \t 오일탱크크기 \t 잔여오일량 \t 현재적재중량 \t 연비");
		System.out.println("=========".repeat(8));
		System.out.println(car);
	
		// 50L 주유 후 트럭 정보
		System.out.println("50L 주유 후 트럭 정보");
		car.setRestOil(50);
		System.out.println(car);
		
		// 50km 주행 후 트럭 정보
		System.out.println("50km 주행 후 트럭 정보");
		car.moving(50);
		System.out.println(car);
		
		// 100kg 적재 후 트럭 정보
		System.out.println("100kg 적재 후 트럭 정보");
		car.addWeight(100);
		System.out.println(car);
		
		// 30km 주행 후 트럭 정보
		System.out.println("30km 주행 후 트럭 정보");
		car.moving(30);
		System.out.println(car);
		
		// 100kg 적재 후 30km 주행시 요금
		System.out.println("요금 : " + car.getCost(30)+ "원");
		
		
	}
}
