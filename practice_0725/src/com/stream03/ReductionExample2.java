package com.stream03;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class ReductionExample2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		OptionalDouble optAvg = list.stream().mapToInt(Integer :: intValue).average();
		System.out.println("멀바 보노보노야 : " + optAvg);
		
		// .isPresent() -> 평균 1 : 0.0
		System.out.println(optAvg.isPresent());
		// .orElse() -> 평균 2 : 0.0
		System.out.println(optAvg.orElse(0.0));
		// .ifPresent() -> 평균 1 : 0.0
		optAvg.ifPresent(System.out :: println);
	}
}
