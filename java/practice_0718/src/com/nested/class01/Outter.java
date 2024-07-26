package com.nested.class01;

public class Outter {
	// 바깥 클래스의 필드
	String name = "바깥쪽";

	// 바깥 클래스
	void method() {
		System.out.println("\t 바깥쪽 메서드");
	}

	// 바깥에서 바깥 필드와 (인스턴스) 메서드 사용
	void useOutter() {
		System.out.println("바깥에서 바깥 필드와 (인스턴스) 메소드 사용");
		System.out.println("\t" + this.name);
		method();
	}

	// 바깥쪽에서 안쪽 필드와 (인스턴스) 메서드 사용
	void useInner() {
		Inner i = new Inner();
		System.out.println("바깥에서 안쪽 필드와 (인스턴스) 메서드 사용");
		System.out.println("\t" + i.name);
		i.method();
	}

	// 안쪽 _ 중첩 (인스턴스 멤버) 클래스 선언
	class Inner {
		// 안쪽 클래스 필드
		String name = "안쪽";

		// 안쪽 클래스 메서드
		void method() {
			System.out.println("\t 안쪽 메서드");
		}

		// 안쪽에서 안쪽 필드와 (인스턴스) 메서드 사용
		void useInner() {
			System.out.println("안쪽에서 안쪽 필드와 (인스턴스) 메서드 사용");
			System.out.println("\t" + name);
			method();
		}

		// 안쪽에서 바깥 필드와 (인스턴스) 메서드 사용
		void useOutter() {
			System.out.println("안쪽에서 바깥 필드와 (인스턴스) 메서드 사용");
			System.out.println("\t" + Outter.this.name);
			Outter.this.method();
		}

	}

}
