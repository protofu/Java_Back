package com.lambda4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	@Override
	public int compareTo(Person o) {
		// return Integer.valueOf(age).compareTo(o.getAge());
		if (age < o.getAge()) return -1;
		else if (age == o.getAge()) return 0;
		return 1;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
