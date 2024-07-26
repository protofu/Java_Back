package com.system;

public class MeasureRuntimeExample {
	public static void main(String[] args) {
		// 나노초 단위의 시간 반환 (시스템과 무관)
		// 정밀한 시간 측정 (경과 시간)
		System.out.println(System.nanoTime());
		
		// 밀리초 단위의 시간 반환
		// 현재 날짜와 시간 (시스템 기준)
		// 시간 기로그 로깅
		System.out.println(System.currentTimeMillis());
	
		long start = System.nanoTime();
		
		// 복잡한 연산
		int sum = 0;
		for (int i = 0; i < 1_000_000; i++) {
			sum += i;
		}
		long end = System.nanoTime();
		
		long rlt = end - start;
		System.out.println("소요 : " + rlt);
	}
}
