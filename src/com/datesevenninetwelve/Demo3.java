package com.datesevenninetwelve;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo3 {
public static void main(String[] args) {
	Person p5 = new Person("Smruti", 24);
	Person p1 = new Person("Mouli", 26);
	Person p2 = new Person("Gugu", 16);
	Person p3 = new Person("Riya", 15);
	Person p4 = new Person("Raj", 29);

	List<Person> l = Arrays.asList(p5, p1, p2, p3, p4);
	
	Predicate<Person> pre = p -> p.age >= 18;
	
	for (Person person : l) {
		if (pre.test(person)) {
			System.out.println(person.name);
		} 
	}
}
}
