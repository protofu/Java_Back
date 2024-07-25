package com.stream04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample2 {
	public static void main(String[] args) {
		List<Beverage> bList = new ArrayList<>();
		bList.add(new Beverage("따뜻한 아메리카노", 1500, false));
		bList.add(new Beverage("따뜻한 바닐라 라떼", 3500, false));
		bList.add(new Beverage("핫츄ㅓ커", 3500, false));
		bList.add(new Beverage("제로콜라", 2000, true));
		bList.add(new Beverage("솔의눈", 2000, true));
		bList.add(new Beverage("실론티", 2000, true));
		
		Map<String, Boolean> newBev = bList.stream().collect(Collectors.toMap(b -> b.getName(), b -> b.isIce()));
		System.out.println(newBev);
		
		Map<Boolean, List<Beverage>> isIceMap = bList.stream().collect(Collectors.groupingBy(b -> b.isIce()));
		for (Map.Entry<Boolean, List<Beverage>> b : isIceMap.entrySet()) {
			System.out.println(b);
		}
		System.out.println();
		List<Beverage> iceList = isIceMap.get(true);
		List<Beverage> hotList = isIceMap.get(false);
		System.out.println(iceList);
		System.out.println(hotList);
		System.out.println();

		List<Beverage> warm = bList.stream().filter(b -> b.getName().contains("따뜻한")).collect(Collectors.toList());
		System.out.println(warm);
	}
}
