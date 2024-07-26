package com.collection.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		// ArrayList 생성 [int]
		List<Integer> list = new Vector<>();

		// 첫번째 스레드 정의
		Thread thread00 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					list.add(i);
					System.out.println("Thread-0에" + i + "추가됨");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		// 첫번째 스레드 정의
		Thread thread01 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 50; i > 0; i--) {
					list.add(i);
					System.out.println("Thread-1에" + i + "추가됨");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread00.start();
		thread01.start();
		
		try {
			thread00.join();
			thread01.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("총 길이 : " + list.size());
		System.out.println(list);
	}
}
