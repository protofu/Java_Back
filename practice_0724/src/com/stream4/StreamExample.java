package com.stream4;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
	String[] strArr = {"맥북", "아이폰", "에어팟"};
	Stream<String> strStream = Stream.of(strArr);	
	strStream.forEach(i -> System.out.print(i + ", "));
	Stream<String> strStream2 = Arrays.stream(strArr);	
}
