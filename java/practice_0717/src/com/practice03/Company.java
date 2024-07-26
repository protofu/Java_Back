package com.practice03;

public class Company {
	private String name;
	private Employee[] employees;
	private static final int EMP_MAX_COUNT = 10;
	private int empCount = 0;
	
	public Company(String name) {
		super();
		this.name = name;
		this.employees = new Employee[EMP_MAX_COUNT];
		this.empCount = 0;
	}

	public void addEmp(String name, int money) {
		if (empCount < EMP_MAX_COUNT) {
			employees[empCount] = new Employee(name, money);
			empCount++;
		} else {
			System.out.println("정원 초과");
		}
	}
	
	public void printEmp() {
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
	
	public int getEmpCount() {
		return empCount;
	}
	
	public void getInfo(int salary) {
		for (Employee e : employees) {
			if (salary <= e.getMoney()) {
				System.out.println(e);
			}
		}
	}

	public double calcAvgMon() {
		if (empCount == 0) {
			return 0;
		}
		return (double) calcAllMon() / empCount;
	}
	
	public int calcAllMon() {
		if (empCount == 0) {
			return 0;
		}
		int sum = 0;
		for (Employee e : employees) {
			sum += e.getMoney();
		}
		return sum;
	}
	
	
	private class Employee {
		private String name;
		private int money;
		
		public Employee(String name, int money) {
			this.name = name;
			this.money = money;
		}
		public String getName() {
			return name;
		}
		public int getMoney() {
			return money;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", money=" + money + "]";
		}

		
	}
}
