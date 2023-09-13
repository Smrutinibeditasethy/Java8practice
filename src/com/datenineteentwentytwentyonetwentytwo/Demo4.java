package com.datenineteentwentytwentyonetwentytwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {

		Employee2 e1 = new Employee2(1, "Rina", 26500.00, "USA");
		Employee2 e2 = new Employee2(2, "Aaram", 46500.00, "INDIA");
		Employee2 e3 = new Employee2(3, "Cumin", 36500.00, "CHINA");
		Employee2 e4 = new Employee2(4, "Devi", 16500.00, "INDIA");
		Employee2 e5 = new Employee2(5, "Bob", 25500.00, "USA") ;

		List<Employee2> l = Arrays.asList(e1, e2, e3, e4, e5);
		
		Map<String, List<Employee2>> data = l.stream().collect(Collectors.groupingBy(e -> e.country));
		
		System.out.println(data);
	}
}

