package com.reference.list1;

public class ListBasic07 {
	public static void main(String[] args) {
		int[] oldArr = {1, 2, 3};
		
		int[] newArr = new int[5]; // {0,0,0,0,0}
		
		// 배열 길이 늘리는 방법1
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		
		// 배열 길이 늘리는 방법2 - arraycopy()
		int[] oldArr2 = {1,2,3};
		int[] newArr2 = new int[5];
		// System.arraycopy(원본배열, 복사시작위치, 새배열, 붙여넣기시작위치, 복사할개수);
		System.arraycopy(oldArr2, 0, newArr2, 0, oldArr2.length);
		
	}
	

}
