// 패키지 선언
package com.mypackage;
// 패키지 가져오기
import java.lang.*;
// 클래스 블록
public class MyClass {
	// 매서드 블록
	public static void main(String[] args) {		
		int result = add(1, 2);
		System.out.println(result);
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
}
