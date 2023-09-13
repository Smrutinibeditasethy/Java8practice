package com.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 32000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 25000.0));
		employeeList.add(new Employee(3, "David", 33, "Male", "Infrastructure", 2018, 52000.0));
		employeeList.add(new Employee(4, "Orlen", 38, "Male", "Development", 2019, 56000.0));
		employeeList.add(new Employee(5, "Charles", 45, "Male", "Security", 2012, 45000.0));
		employeeList.add(new Employee(6, "Cathy", 26, "Female", "Sales", 2011, 36000.0));
		employeeList.add(new Employee(7, "Ramesh", 32, "Male", "HR", 2016, 32000.0));
		employeeList.add(new Employee(8, "Suresh", 33, "Male", "Infrastructure", 2013, 26000.0));
		employeeList.add(new Employee(9, "Gita", 34, "Female", "Sales", 2008, 70000.0));
		employeeList.add(new Employee(10, "Mahesh", 39, "Male", "Security", 2011, 32000.0));
		employeeList.add(new Employee(11, "Gouri", 22, "Female", "Sales", 2018, 36000.0));
		employeeList.add(new Employee(12, "Nithin", 29, "Female", "Sales", 2019, 39000.0));
		employeeList.add(new Employee(13, "Swathi", 36, "Male", "Infrastructure", 2020, 40000.0));
		employeeList.add(new Employee(14, "Buttler", 31, "Male", "Sales", 2011,66000.0));
		employeeList.add(new Employee(15, "Ashok", 30, "Male", "Development", 2018,52000.0));
		employeeList.add(new Employee(16, "Sanvi", 30, "Female", "Infrastructure", 2016, 56000.0));
		

		System.out.println("1.****************************************************************");

		//1.how many male and female employees are there in the org?
		Map<String, Long> maleFemales = employeeList.stream().collect(Collectors.groupingBy((Employee::getGender), Collectors.counting()));
		System.out.println(maleFemales);
		
		System.out.println("2.****************************************************************");
		
		//2.write a java code to print all the departments in the org
		List<String> dept = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println(dept);
		
		System.out.println("3.****************************************************************");
		
		//3.write a java programe to print the average age of the male and females
		
		Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAge);
		
		System.out.println("4.****************************************************************");
		
		//4.get the highest paid employee in the org
		
		Optional<Employee> highpay = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		if (highpay.isPresent()) {
			System.out.println(highpay.get().getName());
		}
		
		System.out.println("5.****************************************************************");

		//5.employee joined after 2015
		
	 employeeList.stream().filter(e -> e.getYearOfJoining()>2015).map(i -> i.getName()).forEach(System.out::println);
	 
		System.out.println("6.****************************************************************");

	 //6.count no of employees in each department
		
		Map<String, Long> num = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(num);
		
		System.out.println("7.****************************************************************");

		//7. avg salary of each dept
	
		Map<String, Double> avgsal= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgsal);
		
		System.out.println("8.****************************************************************");

		//8.get the details of youngest male employee in the devlopment dept
		Optional<Employee> option = employeeList.stream().filter(i -> i.getGender()=="Male"&& i.getDepartment()=="Development").collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		if (option.isPresent()) {
			System.out.println(option.get());
		}
		
		System.out.println("9.****************************************************************");
		
		//9. who is senior in the org in experience
		
		Optional<Employee> senior = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		if (senior.isPresent()) {
			System.out.println(senior.get().getName());
		}
		
		System.out.println("10.****************************************************************");

		//10.how many male and female are there in sales team
		
		Map<String, Long> comp = employeeList.stream().filter(i -> i.getDepartment()=="Sales").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(comp);
		
		System.out.println("11.****************************************************************");
		//11.average salary of male and female empo
		
		Map<String, Double> avgSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSal);
		
		System.out.println("12.****************************************************************");

		
		//12.List down the names of all employees in each department 
		
		Map<String, List<String>> name = employeeList.stream().collect(Collectors.groupingBy((Employee::getDepartment),Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(name);
		
		System.out.println("13.****************************************************************");

		//13. average salary and Total Salary of whole organization 
		
		Double avsal = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Average salary = " +avsal);
		Double tolsal = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("The total salary is  " +tolsal);
		
		System.out.println("14.****************************************************************");

		//14.Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?
		
		Map<Integer, List<String>> young = employeeList.stream().filter(i -> i.getAge()<=25).collect(Collectors.groupingBy((Employee::getAge), Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(young);
		
		List<String> yo = employeeList.stream().filter(j -> j.getAge()<=25).map(j -> j.getName()).collect(Collectors.toList());
		System.out.println(yo);
		
		System.out.println("15.****************************************************************");

			
		//15.Who is the oldest employee in the organization in age
		
		Optional<Employee> sen = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		if (sen.isPresent()) {
			System.out.println(sen.get().getName());
		}
		
		
		System.out.println("16.****************************************************************");

		//16.Second highest salaried employee details in the organization 
		
		Optional<Employee> sal = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
	    if (sal.isPresent()) {
			System.out.println(sal.get().getName());
		}
	}

}
