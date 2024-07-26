package com.thread03;

public class ThreadB extends Thread{
	String fileName;
	@Override
	public void run() {
		Thread.currentThread().setName("다운로드");
		String name = Thread.currentThread().getName();
		System.out.println(name + "시작");
		for (int i = 10; i <= 100; i+=10) {
			System.out.println("다운로드 중..."+(i-7)+"%");
			System.out.println("다운로드 중..."+(i-3)+"%");
			System.out.println("다운로드 중..."+i+"%");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		fileName = "이클립스 설치파일";
		System.out.println(name + "끝");
	}
}
