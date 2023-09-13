package com.datenineteentwentytwentyonetwentytwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//get MAX, MIN and AVG salary from given employees data using Stream API.

public class Demo3 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Robert", 26500.00);
		Employee e2 = new Employee(2, "Abraham", 46500.00);
		Employee e3 = new Employee(3, "Ching", 36500.00);
		Employee e4 = new Employee(4, "David", 16500.00);
		Employee e5 = new Employee(5, "Cathy", 25500.00);
		
		List<Employee> l = Arrays.asList(e1, e2, e3, e4, e5);
		
		//Max salary
		Optional<Employee> maxSalary = l.stream().collect(Collectors.maxBy(Comparator.comparing(a -> a.salary)));
		System.out.println("The maximum salary is : " +maxSalary.get().salary);
		
		//Min salary
		Optional<Employee> minSalary = l.stream().collect(Collectors.minBy(Comparator.comparing(b -> b.salary)));
		System.out.println("The minmum salary is : " +minSalary.get().salary);
		
		//Average salary
		double avgSalary = l.stream().collect(Collectors.averagingDouble(c -> c.salary));
		System.out.println("The average salary is : " +avgSalary);
		
	}

}
