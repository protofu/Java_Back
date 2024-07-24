package com.stream7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("우상혁", "황선우", "김우민", "서채현", "신유빈", "우상혁");
		nameList.stream().distinct().forEach(System.out :: println);
		System.out.println();
		
		nameList.stream().filter(n -> n.contains("우")).forEach(System.out :: println);
		System.out.println();
		// distinct로 중복된 요소가 제거하고, filter로 "우"가 들어간 이름만 나오게 해주세요!
		List<String> filteredList = nameList
			.stream()
			.distinct()
			.filter(n -> n.contains("우"))
			.collect(Collectors.toList());
		
		System.out.println(filteredList);
	}
}
