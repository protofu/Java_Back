package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

public class ReflectionExample {
	public static void main(String[] args) {
		Class clazz = Car.class;
		System.out.println(clazz.getPackageName());
		
		System.out.println(clazz.getSimpleName());
		
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field f : declaredFields) {
			System.out.println(f.getType().getName() + " " +f.getName());
		}
		
		
	
	}
}
