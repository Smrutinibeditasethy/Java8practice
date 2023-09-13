package com.datesevenninetwelve;

import java.util.function.Predicate;

public class Demo1 {
public static void main(String[] args) {
	
	Predicate<Integer> p = i-> i > 10;//lambda expression
	
	System.out.println(p.test(5));
	System.out.println(p.test(15));
}
}
