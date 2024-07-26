package com.collection.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample01 {
	public static void main(String[] args) {
		// 이름과 나이를 가지고, HashMap 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김연아", 33);
		map.put("지민", 8);
		map.put("박보검", 30);
		map.put("전지현", 42);
		map.put("손흥민", 32);
		map.put("지민", 28);
		
		// 요소의 총 개수
		System.out.println("총 entry 수 : " + map.size());
		System.out.println(map);
		
		// 키를 통해 값 얻기
		Integer sonAge = map.get("손흥민");
		System.out.println("손흥민의 나이 : " + sonAge);
		
		// 키로 구성된 set을 구해서, 반복문을 통해 값만 구하기
		Set<String> keySet = map.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer val = map.get(key);
			System.out.println(key + "의 나이는 " + val + "세 입니다.");
		}
		
		System.out.println(keySet);
		
		// 키와 값으로 구성된 set을 구해서, 반복문 통해 키와 값 구하기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key + " -- " + val);
		}
		
		map.forEach((k, v) -> System.out.println(k+v));
		
	}
}
