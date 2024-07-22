package com.thread;

public class ThreadExample02 {
	public static void main(String[] args) {
		// Thread thread = new Thread자식();
		// Thread thread = new WorkerThread();
		Thread thread = new Thread() {
			for (int i = 5; i > 0; i--) {
				System.out.println("스레드 "+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

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
