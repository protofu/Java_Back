package com.collection.list;

import java.util.ArrayList;

public class ArrayListExample01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		
		// ArrayList 전체 요소 출력
		System.out.println("초기화된 arraylist : " + list);
		
		// ArrayLisy에서 특정 요소 제거
		list.remove("banana");
		System.out.println("banana 삭제된 arraylist : " + list);

		// ArrayLisy에서 특정 인덱스 요소 제거
		list.remove(0);
		System.out.println("0번째 삭제된 arraylist : " + list);
	
		// 두리안 추가된 리스트
		list.add("durian");
		System.out.println("두리안 추가된 arraylist : " + list);

		// 0번째 블루베리 추가된 리스트
		list.add(0, "blueberry");
		System.out.println("0번째 블루베리 추가된 arraylist : " + list);
		
		// 특정 인덱스 요소 수정
		list.set(1, "cacao");
		System.out.println("1번째 요소 카카오로 수정된 arraylist : " + list);
	
		// 포함되어 있는지
		boolean containsCacao = list.contains("cacao");
		System.out.println("카카오가 arrayList에 있는지 : " + containsCacao);
	
		// 리스트이 길이
		int listSize = list.size();
		System.out.println("현재 arrayList의 길이 : " + listSize);
		
		// 반복문 돌리기
		// for (int i = 0; i < listSize; i++) {
		//  	String item = list.get(i);
		// }
		
		for (String item : list) {
			System.out.println(item);
		}
		
		// 리스트 요소 전체 삭제
		list.clear();
		System.out.println("전체가 삭제된 arrayList : " + list);
		
	}
}
