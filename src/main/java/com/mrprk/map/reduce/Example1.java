package com.mrprk.map.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 12, 4, 3);
		int sum = 0;
		for (Integer s : list) {
			sum = sum + s;
		}
		System.out.println(sum);

		int res = list.stream().mapToInt((i) -> i).sum();
		System.out.println(res);

		// sum of all elements
		int res1 = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(res1);

// seraching max
		Optional<Integer> maxNum = list.stream().reduce((a, b) -> a > b ? a : b);
		System.out.println(maxNum.get());

		List<Employee> e = EmployeeDB.getAllEmp().stream().filter((emp) -> emp.getGrade().equals("A"))
				.collect(Collectors.toList());
		System.out.println(e);

// find the employee whose has A grade and calculate of average of all those salary
		double avgSal = EmployeeDB.getAllEmp().stream().filter((emp) -> emp.getGrade().equals("A"))
				.map(em -> em.getSalary()).mapToDouble((i) -> i).average().getAsDouble();
		System.out.println(avgSal);

// find the employee whose has A grade and calculate of sum of all those salary
		double sumOfAllSalary = EmployeeDB.getAllEmp().stream().filter((emp) -> emp.getGrade().equals("A"))
				.map(em -> em.getSalary()).mapToDouble((i) -> i).sum();
		System.out.println(sumOfAllSalary);

	}

}
