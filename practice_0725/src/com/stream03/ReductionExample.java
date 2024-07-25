package com.stream03;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ReductionExample {
	public static void main(String[] args) {
		int[] intArr = { 1 };
		// 집계값이 없는 경우 대비하는 방법1
		OptionalDouble optAvg = Arrays.stream(intArr).average();
		if (optAvg.isPresent()) {
			System.out.println("팽균 : " + optAvg.getAsDouble());
		} else {
			System.out.println("퓅귄 : " + 0.0);
		}
		
		// 집계값이 없는 경우 대비하는 방법2
		double avg = Arrays.stream(intArr).average().orElse(0.0);
		System.out.println("풩군 : " + avg);
		
		// 집계값이 없는 경우 대비하는 방법3
		Arrays.stream(intArr).average().ifPresent(a -> System.out.println(a));
	}
}
