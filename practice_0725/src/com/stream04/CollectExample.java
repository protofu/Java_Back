package com.stream04;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Beverage> bList = new ArrayList<>();
		bList.add(new Beverage("아이스 아메리카노", 1500, true));
		bList.add(new Beverage("따끈한 바닐라 라떼", 3500, false));
		bList.add(new Beverage("제로콜라", 2000, true));
		bList.add(new Beverage("솔의눈", 2000, true));
		bList.add(new Beverage("실론티", 2000, true));
		bList.add(new Beverage("실론티", 2000, true));
		
		List<Beverage> price2000 = bList.stream().filter(x -> x.getPrice() == 2000).collect(Collectors.toList());
		System.out.println(price2000);
		System.out.println();
		
		Set<Beverage> len3Name = bList.stream().filter(x -> x.getName().length() == 3).collect(Collectors.toSet());
		System.out.println(len3Name);
		System.out.println();
		
		Map<String, Integer> iceMap = bList.stream().distinct().filter(b -> b.isIce()).collect(Collectors.toMap(b -> b.getName(), b -> b.getPrice()));
		System.out.println(iceMap);
		
	}
}
