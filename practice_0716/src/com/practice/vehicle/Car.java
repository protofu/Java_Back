package com.practice.vehicle;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;
	
	Car() {}
	
	Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public double getRestOil() {
		return restOil;
	}
	
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	// 급유
	void addOil(int oil) {
		if (oil >= 0 && getOilTankSize() >= getRestOil() + oil) {
			setRestOil(oil);	
		} else if (oil < 0) {
			System.out.println("잘못된 Oil 정보입니다.");
		} else {
			System.out.println("최대 용량을 초과합니다.");
		}
		
	}
	// 연비와 주행거리에 따라 오일량을 감소
	void moving(int distance) {
		if (getRestOil() - distance/getEfficiency() > 0) {
			setRestOil(getRestOil() - distance/getEfficiency());
		} else {
			System.out.println("연료가 부족합니다.");
		}
		
	}
	// 적재
	void addWeight(int weight) {
		if (weight >= 0 && getCurWeight()+weight <= getMaxWeight()) {
			setCurWeight(getCurWeight()+weight);
		} else if (weight < 0) {
			System.out.println("잘못된 적재 정보입니다.");
		} else {
			System.out.println("최대 적재량을 초과합니다.");
		}
	}

	@Override
	public String toString() {
		return super.toString() + restOil + "\t\t" + curWeight +"\t\t";
	}

}
