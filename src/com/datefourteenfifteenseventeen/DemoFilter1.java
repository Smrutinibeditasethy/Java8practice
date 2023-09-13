package com.datefourteenfifteenseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoFilter1 {
public static void main(String[] args) {
	List<Integer> l = Arrays.asList(23,56,89,78,45,12,13,46,79);
	
	//1st
	/*for (Integer i : l) {
		if (i>50) {
			System.out.println(i);
		}
	}*/
	 
	
	//2nd
	/*Stream<Integer> s = l.stream();
	Stream<Integer> filter= s.filter(i -> i>50);
	filter.forEach(System.out::println);*/
	
	
	//3rd
	l.stream().filter(i -> i>50).forEach(System.out::println);
}
}
