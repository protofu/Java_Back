package com.lambda4;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonExample {
	public static void main(String[] args) {
//		TreeSet<Person> treeSet = new TreeSet<Person>(new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getAge()-o2.getAge();
//			}
//		});
//		TreeSet<Person> treeSet = new TreeSet<Person>((o1, o2) -> {
//			return o1.getAge()-o2.getAge();
//		});
		TreeSet<Person> treeSet = new TreeSet<Person>(Comparator.comparingInt(Person::getAge));
		treeSet.add(new Person("권지훈", 7));
		treeSet.add(new Person("김태환", 8));
		treeSet.add(new Person("성제현", 6));
		
		System.out.println(treeSet);
	}
}
