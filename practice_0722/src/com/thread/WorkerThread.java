package com.thread;

public class WorkerThread extends Thread {

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println("스레드 "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
