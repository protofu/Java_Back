package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StudentManagementSystem {

	// 필드
	// students / 타입 : List<Student> = new ArrayList<>();
	List<Student> students = new ArrayList<>();
	// studentIds / 타입 : Set<String> = new HashSet<>();
	Set<String> studentIds = new HashSet<>();

	// 기본 생성자만 있음
	public StudentManagementSystem() {
	}

	// addStudent 메서드 (String name, String id)
	// students에 없는 id라면 Student 생성해서 students에 추가하고 & studentsIds에 추가
	void addStudent(String name, String id) {
		boolean isExist = false;
		Iterator<Student> student = students.iterator();
		while (student.hasNext()) {
			Student std = student.next();
			if (std.getId().equals(id)) {
				System.out.println("이미 존재하는 학생입니다.");
				isExist = true;
				break;
			}
		}

		if (!isExist) {
			students.add(new Student(name, id));
			studentIds.add(id);
		}
	}

	// removeStudent 메서드 (String id)
	// 만약 students에 id가 같은 학생이 있으면, 제거
	// studentIds에서도 제거
	void removeStudent(String id) {
		Iterator<Student> student = students.iterator();
		while (student.hasNext()) {
			Student std = student.next();
			if (std.getId().equals(id)) {
				student.remove();
				break;
			}
		}
	}

	// updateStudent 메서드 (String id, String newName, Map<String, double> newGrade)
	// students 반복해서 만약 id가 같은 학생이 있으면,
	// 해당 학생의 이름 변경(setName), 점수 변경(updateGrade) 메서드 실행
	void updateStudent(String id, String newName, Map<String, Double> newGrade) {
		Iterator<Student> student = students.iterator();
		while (student.hasNext()) {
			Student std = student.next();
			if (std.getId().equals(id)) {
				std.setId(id);
				std.setName(newName);
				std.updateGrade(newGrade);
				break;
			}
		}
	}

	// listStudents 메서드
	// students 반복해서 모든 student 출력
	void listStudents() {
		System.out.println("------".repeat(10));
		System.out.println("학 생 정 보");
		System.out.println("------".repeat(10));
		Iterator<Student> student = students.iterator();
		while (student.hasNext()) {
			Student std = student.next();
			System.out.println(std);
		}
	}

	// listStudentGrades 메서드 (String id)
	// students 반복해서 만약 id가 같은 학생이 있으면, 해당 학생 점수 출력
	void listStudentGrade(String id) {
		Iterator<Student> student = students.iterator();
		while (student.hasNext()) {
			Student std = student.next();
			if (std.getId().equals(id)) {
				System.out.println(std.getGrades());
				break;
			}
		}
	}

}
