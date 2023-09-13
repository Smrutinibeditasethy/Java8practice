package com.datefourteenfifteenseventeen;

import java.util.stream.Stream;
import java.util.ArrayList;

//example of steam api 2 methods

public class StreamExample {
public static void main(String[] args) {
	
	//approach 1
	//Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6, 7);
	//s1.forEach(System.out::println);

	//approach 2
	ArrayList<String> name = new ArrayList<>();
	name.add("Smruti");
	name.add("Nibedita");
	name.add("Sethy");
	Stream<String> s2 = name.stream();
	s2.forEach(System.out::print);

}
}
