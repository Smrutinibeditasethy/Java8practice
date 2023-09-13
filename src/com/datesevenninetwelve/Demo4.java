package com.datesevenninetwelve;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Demo4 {
public static void main(String[] args) {
	Employee e1 = new Employee("Smruti", "Hyderabad", "Java");
	Employee e2 = new Employee("Mouli", "Vizag", "Java");
	Employee e3 = new Employee("Ajay", "Rajmandry", "Dotnet");
	Employee e4 = new Employee("Deepika", "Hyderabad", "Testing");
	Employee e5 = new Employee("peter", "Hyderabad", "DB");
	Employee e6 = new Employee("Raj", "Hyderabad", "DB");

	List<Employee> l = Arrays.asList(e1, e2, e3, e4, e5, e6);
	
	Predicate<Employee> pre1 = e -> e.location.equals("Hyderabad");
	Predicate<Employee> pre2 = e -> e.dept.equals("DB");
	
	Predicate<Employee> p = pre1.and(pre2);
	
	for (Employee employee : l) {
		if (p.test(employee)) {
			System.out.println(employee.name);
		}
	}
		
	}
}

