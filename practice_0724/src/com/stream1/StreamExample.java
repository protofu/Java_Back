package com.stream1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<String> languageList = new ArrayList<>();
		languageList.add("Java");
		languageList.add("JavaScript");
		languageList.add("Python");
		languageList.add("C");
		
		Stream<String> ps = languageList.parallelStream();
		ps.forEach(name -> {
			System.out.println(name + " : " + Thread.currentThread().getName());
		});
		System.out.println("=====".repeat(10));
		for (String name : languageList) {
			System.out.println(name + " : " + Thread.currentThread().getName());
		}
	}
}
