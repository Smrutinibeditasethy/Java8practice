package com.datenineteentwentytwentyonetwentytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Collectors

public class Demo1 {

	public static void main(String[] args) {
		Person p1 = new Person("Juju", "MATH");
		Person p2 = new Person("Jumanji", "ENGLISH");
		Person p3 = new Person("Puma", "HINDI");
		Person p4 = new Person("Sujana", "MATH");
		Person p5 = new Person("Juka", "COMPUTER");
		
		List<Person> l = Arrays.asList(p1, p2, p3, p4, p5);
		
		List<Person> mathmatician = l.stream().filter(p -> p.subject.equals("MATH")).collect(Collectors.toList());
		mathmatician.forEach(System.out::println);
	}

}
