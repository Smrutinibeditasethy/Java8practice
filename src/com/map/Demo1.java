package com.map;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
public static void main(String[] args) {
	List<Integer> age = Arrays.asList(2,5,7,3,8,9);
	
	age.stream().map(n-> "Age" +String.valueOf(n)).forEach(n-> System.out.println(n +" as a " +n.getClass().getName()));
}
}
