package com.datesevenninetwelve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//this code is taking so many lines 

public class Demo16 {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	a.add(12);
	a.add(23);
	a.add(14);
	a.add(15);
	a.add(36);
	 System.out.println("Before sorting : " +a);
	 Collections.sort(a);
	 System.out.println("After sorting : " +a);
	 Collections.sort(a, new MyComparator());
	 System.out.println("After using comparator : " +a);
	 
}
}


class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1<o2) {
			return 1;
		}else {
		return -1;
		}
	}
	
}
