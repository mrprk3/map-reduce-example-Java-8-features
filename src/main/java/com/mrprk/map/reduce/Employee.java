package com.mrprk.map.reduce;

import java.util.List;

public class Employee {

	private int id;

	private String name;

	private int salary;
	
	private String grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(int id, String name, int salary, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", grade=" + grade + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}