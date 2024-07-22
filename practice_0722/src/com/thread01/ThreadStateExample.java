package com.thread01;

public class ThreadStateExample {
	public static void main(String[] args) {
		// Thread의 상태
		// NEW : 스레드가 생성된 후, start 전
		// RUNNABLE : start 후 실행 준비가 된 상태 (실행 중 일...수도? 실행 대기일수도...)
		// TERMINATED : 실행 종료	
		
		Thread.State state;
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1_000_000_000; i++) {
					
				}
			}
		};
		state = thread.getState();
		System.out.println("스레드 상태 1 " + state);
		
		thread.start();
		state = thread.getState();
		System.out.println("스레드 상태 2 " + state);
		
		try {
			// CPU를 해당 
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		state = thread.getState();
		System.out.println("스레드 상태 3 " + state);
		
	}
}
