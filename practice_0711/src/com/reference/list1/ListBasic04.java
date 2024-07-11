package com.reference.list1;

public class ListBasic04 {
	public static void main(String[] args) {
		String[] menus = {"햄버거", "떡볶이", "불백", "김치찜"};
		printItems("점심메뉴", menus);
		
		menus = new String[]{"1", "2", "3", "4"};
		printItems("새로운 메뉴", menus);
		
		printItems("또 새로운 메뉴", new String[]{"54", "43", "32", "12"});
	}
	
	public static void printItems(String name, String[] strArr) {
		System.out.println(name + "을 출력합니다.");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("\t" + strArr[i]);
			
		}
	}
}
