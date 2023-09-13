package com.datefourteenfifteenseventeen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//print name with its length which are starting with 'A' using Stream API

public class StreamMap2 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Smrui", "Mouli", "Deepika", "Ajay", "Manisha");
	
	names.stream().filter(a -> a.startsWith("A")).map(name -> name +"\n " + name.length()).forEach(name -> System.out.println(name));
}
}
