package com.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int id;
	private String name, position, department;
	private int salary;
	
	
}
