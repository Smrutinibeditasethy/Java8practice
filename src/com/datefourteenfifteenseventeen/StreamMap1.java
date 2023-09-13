package com.datefourteenfifteenseventeen;

import java.util.Arrays;
import java.util.List;

public class StreamMap1 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("india","usa","uk", "japan");
	
	//names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
	
	names.stream().map(a -> a.length()).forEach(System.out::println);
}

}
