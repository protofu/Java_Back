package com.thread01;

public class ThreadNameExample {
	public static void main(String[] args) {
		// 1. Thread의 생성자 매개변수로 Runnable 인터페이스 사용
		// 2. Thread의 자식 객체를 만들어 사용
		
		// 익명 구현 객체
		Thread thread01 = new Thread(new Runnable() {
			@Override
			public void run() {
				// 현재 해당되는 thread 가져오기
				Thread thread = Thread.currentThread();
				String threadName = thread.getName();
				System.out.println(thread.getName());
				for (int i = 0; i <= 100; i+=10) {
					try {
						Thread.sleep(800);
						System.out.println(threadName + " : "+ i + "%");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		// 익명 자식 객체
		Thread thread02 = new Thread() {
			@Override
			public void run() {
				Thread thread = Thread.currentThread();
				String threadName = thread.getName();
				System.out.println(thread.getName());
				for (int i = 0; i <= 100; i+=10) {
					try {
						Thread.sleep(500);
						System.out.println(threadName + " : "+ i + "%");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		// 메인 thread 가져오기
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		
		thread01.start();
		thread02.start();
	}
}
