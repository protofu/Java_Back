package com.anonymous.implement;

public class Home {
	// 필드에 인터페이스 구현 객체 대입
	// private RemoteControl rc = new Television();
	// 필드에 인터페이스 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("익명 오디오 온!!!!!!!");
		}

		@Override
		public void turnOff() {
			System.out.println("익명 5D5 옾!!!!!!!!!");
		}
	};

	public void play() {
		rc.turnOn();
	}

	public void useSwitch() {
		// 로컬 변수에 인터페이스 구현 객체 대입
		// Switch s = new BathRoomSwitch();
		// 로컬 변수에 인터페이스 익명 구현 객체 대입
		Switch s = new Switch() {
			@Override
			public void click() {
				System.out.println("익명 두꺼비집 온!");
			}
		};
		s.click();
	}
	
	public void exercise(GymLink g) {
		g.use();
	}
}
