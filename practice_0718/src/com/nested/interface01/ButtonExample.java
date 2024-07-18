package com.nested.interface01;

import com.nested.interface01.Button.ClickListener;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();

		class OkListener implements ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 눌렀습니다.");
			}
		}

		btnOk.setClickListener(new OkListener());
		btnOk.click();

		Button btnCancel = new Button();

		btnCancel.setClickListener(() -> System.out.println("취소 버튼을 누름 ㅋ"));
		btnCancel.click();
	}
}
