package com.nested.interface01;

public class Button {
	// 중첩 인터페이스 선언 (static은 생략)
	public /* static */ interface ClickListener {
		void onClick();
	}
	// 필드로 선언
	private ClickListener clickListener;
	
	// 메서드 선언
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}

	
	
}
