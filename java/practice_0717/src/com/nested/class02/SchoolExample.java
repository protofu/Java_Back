package com.nested.class02;

public class SchoolExample {
	public static void main(String[] args) {
		School school = new School("인규대");
		
		school.addStudent("홍다희", 100);
		school.addStudent("권지훈", 95);
		school.addStudent("박병찬", 90);
		school.addStudent("유현준", 85);
		school.addStudent("하민성", 80);
		school.addStudent("서영훈", 75);
		school.addStudent("한민혁", 70);
		school.addStudent("안민영", 65);
		school.addStudent("김태환", 60);
		school.addStudent("성제현", 55);
		school.addStudent("박진국", 50);
		school.addStudent("오희재", 45);
		school.addStudent("정서연", 40);
		school.addStudent("최인규", 40000);
		
		school.printStudent();
		
		System.out.println(school.calcAvgGrade()
				);
	}
}
