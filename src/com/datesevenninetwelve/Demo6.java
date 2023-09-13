package com.datesevenninetwelve;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//list of person with name starts with S or location from Vizag

public class Demo6 {
public static void main(String[] args) {
	 Person1 p1 = new Person1("Smruti", "Odisha");
	 Person1 p2 = new Person1("Kurma", "Vizag");
	 Person1 p3 = new Person1("Priya", "Odisha");
	 Person1 p4 = new Person1("Kuku", "Punjab");
	 Person1 p5 = new Person1("Sujata", "Odisha");
	 Person1 p6 = new Person1("Mera", "Vizag");

	 
	 List<Person1> l = Arrays.asList(p1, p2, p3, p4, p5, p6);
	 
	 Predicate<Person1> pre1 = p -> p.name.startsWith("S");
	 Predicate<Person1> pre2 = p -> p.location.equals("Vizag");
	 
	 
	 Predicate<Person1> p = pre1.or(pre2);
	 
	 for (Person1 person:l) {
		 if (p.test(person)) {
			 System.out.println(person.name);
		 }
	 }
}
}
