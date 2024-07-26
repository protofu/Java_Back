package com.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {
	// 필드
	// name과 id는 문자열
	private String name, id;
	// grades는 Map<String, double>  // 점수는 new HashMap();
	Map<String, Double> grades = new HashMap<>();
	
	// 생성자(String name, String id)
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	// Getter, Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, Double> getGrades() {
		return grades;
	}

	public void setGrades(Map<String, Double> grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "[이름=" + name + ", id=" + id + ", 성적="
				+ (grades != null ? toString(grades.entrySet(), maxLen) : null) + "]";
	}

	// toString
	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
			if (i > 0) {
				builder.append(", ");
			}
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}
	
	// addGrade 메서드(String subject, double grade)
	void addGrade(Map<String, Double> newGrade) {
		setGrades(newGrade);
	}
	// updateGrade 메서드(String subject, double grade)
	public void updateGrade(Map<String, Double> newGrade) {
		setGrades(newGrade);
	}

}
