package com.review;

public class Driver {
	public static void main(String[] args) {
		Driver inkyu = new Driver();
		inkyu.drive(new K5());
		
		inkyu.drive(new Tesla());
		
		inkyu.drive(new Car() {

			@Override
			public void run() {
				System.out.println("모르는 차인데 운전이 된다..?");
			}
		});
		
		inkyu.drive(() -> System.out.println("이름없는 슈퍼카 붕붕"));
	}



}
