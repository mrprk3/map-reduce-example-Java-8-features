package com.mrprk.map.reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {

	public static List<Employee> getAllEmp() {
		return Stream.of(new Employee(101, "Jhon", 15000, "A"), new Employee(102, "Kim", 16000, "A"),
				new Employee(104, "Devid", 5000, "B")).collect(Collectors.toList());

	}

}
