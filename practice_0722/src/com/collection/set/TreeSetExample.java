package com.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		// TreeSet 컬렉션 생성 [int] 변수명 score
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 객체에 데이터를 저장 (87, 98, 75, 95, 80)
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 오름차순으로 자동 정렬된다
		System.out.println(scores);
		
		// 특정 요소 가져오기
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 바로 아래 점수 : " + scores.lower(95));
		System.out.println("95점 바로 위 점수 : " + scores.higher(95));
		System.out.println("96점이거나 바로 아래 점수 : " + scores.floor(96));
		System.out.println("96점이거나 바로 위 점수 : " + scores.ceiling(96));
		
		NavigableSet<Integer> descSet = scores.descendingSet();
		System.out.println(descSet);
		
		NavigableSet<Integer> up80Set = scores.tailSet(80, true);
		System.out.println(up80Set);
	
		NavigableSet<Integer> up80down95Set = scores.subSet(80, true, 95, false);
		System.out.println(up80down95Set);
	}
}
