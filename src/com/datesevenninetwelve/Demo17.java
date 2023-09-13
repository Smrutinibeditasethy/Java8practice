package com.datesevenninetwelve;

import java.util.ArrayList;
import java.util.Collections;

// this code is done in  so less lines

public class Demo17 {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	a.add(12);
	a.add(23);
	a.add(14);
	a.add(15);
	a.add(36);
	 System.out.println("Before sorting : " +a);
	 Collections.sort(a, (i, j) -> (i<j)? 1 :-1); //here comparator is written in lambda expression
	 System.out.println("After sorting : " +a);
	 
}
}
