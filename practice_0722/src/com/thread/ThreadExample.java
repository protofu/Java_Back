package com.thread;

import java.util.Iterator;

public class ThreadExample {
	public static void main(String[] args) {
		// Thread thread = new Thread(/* Runnable Interface */);
		// Thread thread = new Thread(new Task());
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 5; i > 0; i--) {
					System.out.println("스레드 " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
			
		});
		
		// 해당 스레드를 시작한다
		thread.start();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("메인 " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
