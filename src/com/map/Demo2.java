package com.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
public static void main(String[] args) {
	List<Integer> age = Arrays.asList(25, 36, 58, 45, 21, 23);
	
	List<String> mappedAge = age.stream().map(n -> "Age " +String.valueOf(n)).collect(Collectors.toList());
	
	System.out.println("The orginal age list : " +age);
	System.out.println("The the mapped age list : "+mappedAge);
}
}
