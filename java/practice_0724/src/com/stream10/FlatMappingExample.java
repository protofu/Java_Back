package com.stream10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
	public static void main(String[] args) {
		List<String> msgList = new ArrayList<>();
		msgList.add("하이 보라돌이");
		msgList.add("안녕 ㅋㅋ 뭘보냐 어쩌라고");
		msgList.add("뚜비야 어디 가는거야");
		
		msgList.stream() // Stream<stream>
			.flatMap(msg -> Arrays.stream(msg.split(" "))) // Stream<stream>
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		List<String> strNums = Arrays.asList("10, 20, 30", "40, 50", "60");
		
		strNums
			.stream()
			.flatMapToInt(num -> {
				String[] strArr = num.split(", ");
				int[] intArr = new int[strArr.length];
				for (int i = 0; i < strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i]);
				}
				return Arrays.stream(intArr);
			}) // IntStream
			.forEach(i -> System.out.println(i));
			
	}
}
