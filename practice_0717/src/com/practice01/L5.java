package com.practice01;

public class L5 extends Car implements Temp {
	public L5() {}
	
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	// 주행
	@Override
	void go(int distance) {
		int res = distance / 8;
		setOilSize(getOilSize()-res);
		setDistance(distance);
	}
	
	// Oil 충전
	@Override
	void setOil(int oilSize) {
		if (oilSize >= 0 && getOilSize() + oilSize <= getOilTank()) {
			setOilSize(getOilSize() + oilSize); ;
		} else if(oilSize < 0) {
			System.out.println("잘못된 주유 정보");
		} else {
			System.out.println("주유량 초과");
		}
	}
	// 엔진 온도 측정
	@Override
	public int getTempGage() {
		int dist = getDistance();
				
		return dist/5;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t\t" + getTempGage();
	}

	



}
