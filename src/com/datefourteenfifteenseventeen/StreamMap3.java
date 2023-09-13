package com.datefourteenfifteenseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Task : Print Emp Name with Emp age whose salary is >= 50,000 using Stream API.

public class StreamMap3 {
public static void main(String[] args) {
	Employee e1 = new Employee("Smruti", 25, 56000.0);
	Employee e2 = new Employee("Jevvan", 29, 60000.0);
	Employee e3 = new Employee("Ruhi", 30, 50000.0);
	Employee e4 = new Employee("Zumzum", 21, 20000.0);
	Employee e5 = new Employee("Dhinchak", 23, 40000.0);

	Stream<Employee> s = Stream.of(e1, e2, e3, e4, e5);
	
	s.filter(i -> i.salary >=50000.0).map(a -> a.name + "----" + a.age).forEach(a -> System.out.println(a));
}
}
