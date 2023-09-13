package com.datesevenninetwelve;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//list of family member whose name starts with P and are from mother side and age above 20

public class Demo7 {
	public static void main(String[] args) {
		Family f1 = new Family("Priya", "Mside", 26);
		Family f2 = new Family("Majnu", "Fside", 15);
		Family f3 = new Family("Pooja", "Fside", 21);
		Family f4 = new Family("Manu", "Mside", 22);
		Family f5 = new Family("Priyanka", "Mside", 26);
		Family f6 = new Family("Sujata", "Fside", 29);
		Family f7 = new Family("Puma", "Mside", 30);
		Family f8 = new Family("Pima", "Mside", 14);

		List<Family> l = Arrays.asList(f1, f2, f3, f4, f5, f6, f7, f8);
		
		Predicate<Family> pre1 = p -> p.name.startsWith("P");
		Predicate<Family> pre2 = p -> p.relation.equals("Mside");
		Predicate<Family> pre3 = p -> p.age >20;
		
		Predicate<Family> pe = pre1.and(pre2).and(pre3);
		
		for(Family family:l) {
			if(pe.test(family)) {
			System.out.println(family.name +"---" +family.age);
	
}
			}
		}
		
		
	}

