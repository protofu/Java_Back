package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample02 {
	public static void main(String[] args) {
		// HashSet 컬렉션 객체 생성
		Set<Member> set = new HashSet<>();
		// 김밥 25세 객체 저장
		set.add(new Member("김밥", 25));
		// 김밥 25세 객체 저장
		set.add(new Member("김밥", 25));

		// 저장된 객체 수를 출력
		System.out.println("총 길이 : " + set.size());
		System.out.println(set);
	}
}
