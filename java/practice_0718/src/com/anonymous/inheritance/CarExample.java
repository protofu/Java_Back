package com.anonymous.inheritance;

public class CarExample {
	public static void main(String[] args) {
		Car c = new Car();
		c.run();
		
		System.out.println();
		
		c.start();
		
		System.out.println();
	
//		c.curve(new Handle());
//		c.curve(new PowerHandle());
		// 매개변수 값으로 익명 자식 객체를 대입해서 사용
		c.curve(new Handle() {

			@Override
			void turn() {
				System.out.println("익핸돌 ㅋ ");
			}
			
		});
	}
}
