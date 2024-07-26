package com.oop.interface05;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// Phone은 PhoneService를 직접적으로 구현하고 있기 때문에 자동 형 변환이 가능
		PhoneService ps1 = new Phone();

		// SmartPhone은 Phone을 상속받아 PhoneService를 간접적으로 구현하고 있기 때문에 자동 형 변환 가능
		PhoneService ps2 = new SmartPhone();

		// PhoneService에는 Smart 기능이 없다.
		// 따라서 SmartService 메소드를 호출하고 싶다면, 강제 타입 변환이 필요하다.
//		SmartPhone sp1 = (SmartPhone) ps1; 오류
		SmartPhone sp2 = (SmartPhone) ps2;

//		SmartService ss1 = (SmartService) sp1; 오류
		SmartService ss2 = (SmartService) sp2;

	}
}
