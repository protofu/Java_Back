package com.stream;

import java.util.Arrays;
import java.util.List;

public class PracticeExample {
	public static void main(String[] args) {
		Product mic = new Product("마이크");
		Product headSet = new Product("헤드셋");
		Product earPhone = new Product("이어폰");
		Product speaker = new Product("스피커");
		Product iPad = new Product("아이패드");
		Product monblancPen = new Product("몽블랑 펜");
		Product rolexWatch = new Product("롤렉스");
		Product dubaiChoco = new Product("두바이 쳐클릿");
		Product car = new Product("자동차");
		
		List<User> users = Arrays.asList(
				new User("전소", Arrays.asList(
					new Order(Arrays.asList(mic, headSet, earPhone, speaker)),
					new Order(Arrays.asList(iPad)),
					new Order(Arrays.asList(monblancPen))
				)),
				new User("기우", Arrays.asList(
					new Order(Arrays.asList(rolexWatch, dubaiChoco)),
					new Order(Arrays.asList(car)),
					new Order(Arrays.asList(mic, headSet, earPhone, speaker))
				))
				
		);
		
		// Stream<User>를 생성
		//	-> flatMap으로 Stream<Order>로 변환
		//	-> flatMap으로 Stream<Product>로 변환
		//	-> 각 상품이름을 출력
		
		users
			.stream()
			.flatMap(u -> u.getOrders().stream())
			.flatMap(o -> o.getProducts().stream())
			.distinct()
			.filter(p -> p.getName().length()>3)
			.forEach(p -> System.out.println(p.getName()));
		
	}
}
