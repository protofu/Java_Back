package com.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// ArrayList 객체 생성 [문자열]
		List<String> list1 = new ArrayList<>();

		// LinkendList 객체 생성 [문자열]
		List<String> list2 = new LinkedList<>();
		
		long sTime, eTime;
		
		sTime = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			list1.add(0, String.valueOf(i));
		}
		eTime = System.nanoTime();
		System.out.println("삽입시 걸린 시간 : " + (eTime - sTime));

		sTime = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			list2.add(0, String.valueOf(i));
		}
		eTime = System.nanoTime();
		System.out.println("삽입시 걸린 시간 : " + (eTime - sTime));
		
		sTime = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			list1.get(i);
		}
		eTime = System.nanoTime();
		System.out.println("조회시 걸린 시간 : " + (eTime - sTime));
		
		sTime = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			list2.get(i);
		}
		eTime = System.nanoTime();
		System.out.println("조회시 걸린 시간 : " + (eTime - sTime));

	}
}
