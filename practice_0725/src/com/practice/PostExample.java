package com.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PostExample {
	public static void main(String[] args) {
		List<Comment> cList1 = Arrays.asList(new Comment(1, 1, "좋은 글이네요", "성제현", LocalDateTime.now().minusDays(1)),
				new Comment(2, 1, "저도 잘 읽었습니다", "김태환", LocalDateTime.now().minusHours(3)));
		List<Comment> cList2 = Arrays.asList(new Comment(3, 2, "정말 유익합니다", "하민성", LocalDateTime.now().minusDays(3)),
				new Comment(4, 2, "감사합니다", "안민영", LocalDateTime.now().minusDays(2)));

		List<Post> pList = new ArrayList<>();

		pList.add(new Post(1, "Java를 잡아라", "Java는 객체지향 프로그래밍 언어입니다.", "한민혁", LocalDateTime.now().minusDays(7), cList1));

		pList.add(new Post(2, "스트림 파헤치기", "Stream API는 내부 반복자이구요.", "권지훈", LocalDateTime.now().minusDays(6), cList2));

		pList.add(new Post(3, "스프링은 봄", "자바 스프링은 봄을 잡다.", "최인규", LocalDateTime.now().minusDays(1), null));

		PostSystem ps = new PostSystemImpl();

		
		ps.insertPost(pList);
//		ps.insertPost(pList, title, content, author);

		System.out.println("한민혁님이 작성한 게시물 보기");
		ps.filterPostsByAuthor(pList, "한민혁").forEach(System.out::println);

		System.out.println();

		System.out.println("모든 댓글 보기");
		ps.getAllComments(pList).forEach(System.out::println);

		System.out.println();

		System.out.println("모든 게시물 제목 보기");
		ps.getAllPostTitles(pList).forEach(System.out::println);

		System.out.println();

		System.out.println("키워드로 필터링된 게시물 보기");
		ps.filterPostsByKeyword(pList, "스트림").forEach(System.out::println);

		System.out.println();

		System.out.println("게시물별 댓글 수 보기");
		ps.getCommentCountByPost(pList).forEach((postId, count) -> {
			System.out.println(postId + "번 게시물 댓글 수 : " + count);
		});

		System.out.println();
		ps.getLatestPosts(pList).forEach(System.out::println);

		System.out.println();
		System.out.println("가장 뒷 게시물");
		System.out.println(ps.getHighestPostId(pList));

	}
}
