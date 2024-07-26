package com.exception;

public class ExceptionExample04 {
	public static void main(String[] args) {
		String[] strArr = {"80", "90", "10O"};
		for (int i = 0; i <= strArr.length; i++) {
			try {
				String string = strArr[i];
				int value = Integer.parseInt(string);
				System.out.println("strArr["+i+"]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스 초과 : " + e.getMessage());
			} catch (NumberFormatException | NullPointerException e) {
				System.out.println("숫자로 변환할 수 없음 : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("실행에 문제가 있음");
			}
			
		}

	}
}
