package com.anonymous;

public class HumanExample {
	public static void main(String[] args) {
		Human h = new Human();
		h.start();
		
		Human hh = new Hunter();
		hh.start();
		
		Human hhh = new Human() {
			@Override
			public void work() {
				System.out.println("익명의 일꾼");
			}
			
		};
		hhh.start();
	
		Human korean = new Human(new HumanServiceImpl());
		korean.start();
		
		Human american = new Human (new HumanService() {	
			@Override
			public void run() {
				System.out.println("yoyoyo Hi Man!!!");
			}
		});
		american.start();
	}
}
