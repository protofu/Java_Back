package com.oop.practice04;

public class Student {
	// 인스턴스 멤버 변수 정의
	private String name, id;
	private int age;
	private static int students = 0;
	
	// private 메소드 generateId를 통해 학생 ID 생성
	// generateId => "S" + (1000+학생수);
	// 생성자에서 학생 이름과 나이를 설정하고 ID 생성
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = generateId();
	}
	private String generateId() {
		int allStudent = 1000 + setStudentCount();
		return "S" + allStudent;
	}
	
	// final 메소드를 통해 학생 정보 출력
	final void printStudentInfo() {
		// "ID: " + id + ", Name: " + name + ", Age: " + age
		System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
	}
	//정적 멤버 변수로 StudentCount 정의
	//정적 메소드를 통해 생성된 학생 수 반환
	public static int getStudentCount() {
		return students;
	}
	private static int setStudentCount() {
		students++;
		return students;
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}
	// getter
	public String getName() {
		return name;
	}
	
}
