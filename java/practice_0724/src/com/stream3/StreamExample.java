package com.stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<Product> pList = new ArrayList<>();
		
		for (int i = 0; i <= 5; i++) {
			Product p = new Product(i, (int) (10000 * Math.random()), "상품" + i , "회사명");
			pList.add(p);
		}
		
		Stream<Product> stream = pList.stream();
		stream.forEach(p -> System.out.println(p));
		Stream<Product> stream1 = pList.stream();
		double avg = stream1.mapToInt(Product :: getPrice).average().getAsDouble();
		System.out.println(avg);
	
		Stream<Product> stream2 = pList.stream();
		System.out.println(stream2.mapToInt(Product :: getPrice));
	}
}
