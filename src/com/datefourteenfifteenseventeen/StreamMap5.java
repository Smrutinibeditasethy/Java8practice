package com.datefourteenfifteenseventeen;

import java.util.Arrays;
import java.util.List;

//boolean anyMatch (Predicate p )
//boolean allMatch (Predicate p )
//boolean noneMatch (Predicate p )

public class StreamMap5 {
public static void main(String[] args) {
	Student s1 = new Student("Juju", "MATH");
	Student s2 = new Student("Jumanji", "ENGLISH");
	Student s3 = new Student("Puma", "HINDI");
	Student s4 = new Student("Sujana", "MATH");
	Student s5 = new Student("Juka", "COMPUTER");

	List<Student> l = Arrays.asList(s1, s2, s3, s4, s5);
	
	Boolean status1 = l.stream().anyMatch(a -> a.subject.equals("MATH"));
	System.out.println("Any student took Maths : " +status1);
	
	Boolean status2 = l.stream().allMatch(b -> b.subject.equals("HINDI"));
	System.out.println("All are from HINDI subject : " +status2);
	
	Boolean status3 = l.stream().noneMatch(c -> c.subject.equals("GEOGRAPHY"));
	System.out.println("No one took geography : " +status3);
}
}
