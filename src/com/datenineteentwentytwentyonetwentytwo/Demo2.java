package com.datenineteentwentytwentyonetwentytwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//collect names of persons who took maths and store into names collection

public class Demo2 {
public static void main(String[] args) {
	Person p1 = new Person("Juju", "MATH");
	Person p2 = new Person("Jumanji", "ENGLISH");
	Person p3 = new Person("Puma", "HINDI");
	Person p4 = new Person("Sujana", "MATH");
	Person p5 = new Person("Juka", "COMPUTER");
	
	List<Person> l = Arrays.asList(p1, p2, p3, p4, p5);
	
	List<String> names = l.stream().filter( p -> p.subject.equals("MATH")).map(m -> m.name).collect(Collectors.toList());
	System.out.println(names);
	
}
}
