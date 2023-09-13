package com.datefourteenfifteenseventeen;

import java.util.Arrays;
import java.util.List;

public class DemoFilter2 {
public static void main(String[] args) {
	List<String> n = Arrays.asList("John", "Anushka", "Anupama", "Smith", "Ashok");
	
	n.stream().filter(i -> i.startsWith("A")).forEach(System.out::println);
}
}
