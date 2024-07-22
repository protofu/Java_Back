package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample02 {
	public static void main(String[] args) {
		// Board를 요소로 갖는 ArrayList 생성
		List<Board> list = new ArrayList<>();
		
		// 객체를 추가
		// 제목1, 내용1, 글쓴이1
		list.add(new Board("김밥", "단무지", "아주머니"));
		// 제목2, 내용2, 글쓴이2
		list.add(new Board("라면", "신라면", "아주머니2"));
		// 제목3, 내용3, 글쓴이3
		list.add(new Board("볶음밥", "계란", "아주머니3"));
		// 제목4, 내용4, 글쓴이4
		list.add(new Board("짜장면", "양파", "아주머니4"));
		// 제목5, 내용5, 글쓴이5
		list.add(new Board("짬뽕", "해물", "아주머니5"));
		
		// 저장된 객체의 총 개수를 출력
		System.out.println(list.size());
		// 객체 전체 출력
		System.out.println(list);
		// 2번째 객체 요소 삭제
		list.remove(1);
		// 2번째 인덱스의 객체 가져와서 출력
		System.out.println(list.get(1));
		// 반복문을 통해서 하나씩 객체 출력
		for (Board board : list) {
			System.out.print(board+ " ");
		}
	}
}
