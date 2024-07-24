package com.lambda2;

public class Constructor {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.getMember1(new Creatable1() {
			@Override
			public Member create(String id) {
				return new Member(id);
			}	
		});

		p.getMember2(new Creatable2() {
			@Override
			public Member create(String id, String name) {
				return new Member(id, name);
			}	
		});
		// =========================================================
		p.getMember1(id -> new Member(id));
		p.getMember2((id, name) -> new Member(id, name));
		// =========================================================
		p.getMember1(Member :: new);
		p.getMember2(Member :: new);
		
	}
}
