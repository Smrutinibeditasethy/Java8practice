package com.datenineteentwentytwentyonetwentytwo;

import java.util.stream.Stream;

//parallel stream example

public class Demo5 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(12, 13, 14, 15);
		s.forEach(n -> System.out.println(n + "::" +Thread.currentThread()));
		
		
		System.out.println("*******************************");
		Stream<Integer> ss = Stream.of(12, 13, 14, 15);
		ss.parallel().forEach(n -> System.out.println(n + "::" +Thread.currentThread()));
	}

}
