package com.practice.vehicle;

public class Truck extends Car {
	Truck() {
		super();
	}

	Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	// 5kg 당 연비 0.2씩 감소
	@Override
	public double getEfficiency() {
		return super.getEfficiency()-(getCurWeight()/5*0.2);
	}
	

	
	// calcOil 호출, 오일감소량 획득, 잔여오일에서 감소량 뺀 새로운 잔여오일로 재설정
	@Override
	void moving(int distance) {
		double res = calcOil(distance);
		setRestOil(getRestOil()-res);
	}
	
	// 거리를 연비로 나누어 오일 소모량을 추출하고 리턴
	private double calcOil(int distance) {
		double res = distance / getEfficiency();
		return res;
	}
	
	// calcOil() 호출, 오일 감소량 획득, 1L당 3000원의 요금 산정 후 리턴, 소수점 버리기
	int getCost(int distance) {
		double res = calcOil(distance) * 3000;
		return (int) res;
	}
	
	// 부모의 toString()에 연비를 추가하여 리턴
	@Override
	public String toString() {
		return super.toString() + getEfficiency()+"\n";
	}

	

	
	
}
