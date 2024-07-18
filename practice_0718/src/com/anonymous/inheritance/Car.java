package com.anonymous.inheritance;

public class Car {
	private Tire frontLeft = new Tire();
	private Tire frontRight = new KumhoTire();
	private Tire rearLeft = new HankookTire();
	// 필드에 익명자식객체를 대입해서 사용
	private Tire rearRight = new Tire() {
		@Override
		public void roll() {
			System.out.println("3. 익타굴 ㅋ");
		}
	};
	
	public void run() {
		frontLeft.roll();
		frontRight.roll();
		rearLeft.roll();
		rearRight.roll();
	}

	public void start() {
//		Engine e = new Engine();
//		Engine e = new SuperEngine();
		// 로컬 변수에 익명 자식 객체를 대입해서 사용
		Engine e = new Engine() {
			
			@Override
			void use() {
				System.out.println("ㅋ 익명엔진임 ㅋ");
			}
			
		};
		
		e.use();
	}
	
	public void curve(Handle h) {
		h.turn();
	}
}
