package com.datenineteentwentytwentyonetwentytwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find the number of Zeros and Ones

public class Demo7 {
public static void main(String[] args) {
	List<Integer> l = Arrays.asList(0,1,1,1,1,0,0,1,0,0,1,0,1);
	
	Map<Integer, Long> m = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(m);
}
}
