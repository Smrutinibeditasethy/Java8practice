package com.datesevenninetwelve;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//list of students who are of class X and are females and name starts with K

public class Demo5 {
public static void main(String[] args) {
	Student s1 = new Student("Smruti", "F", "XII");
	Student s2 = new Student("Rani", "F", "X");
	Student s3 = new Student("Kirthi", "F", "X");
	Student s4 = new Student("Kusum", "F", "X");
	Student s5 = new Student("Sujata", "F", "XI");
	Student s6 = new Student("Meena", "F", "IX");
	Student s7 = new Student("Keema", "F", "X");
	Student s8 = new Student("Kaju", "F", "X");
	
	List<Student> l = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8);
	
	Predicate<Student> pre1 = e -> e.name.startsWith("K");
	Predicate<Student> pre2 = e -> e.gender.equals("F");
	Predicate<Student> pre3 = e -> e.standard.equals("X");

	Predicate<Student> p = pre1.and(pre2).and(pre3);
	
	for (Student student : l) {
		if (p.test(student)) {
			System.out.println(student.name);
		}
	}
	

}
}
