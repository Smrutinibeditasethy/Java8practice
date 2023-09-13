package com.datefourteenfifteenseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap4 {

	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("core java", "adv java", "springboot");

		List<String> uicourses = Arrays.asList("html", "css", "bs", "js");
		
		List<List<String>> course = Arrays.asList(javacourses, uicourses);
		//course.stream().forEach(System.out::println);
		
		Stream<String> s = course.stream().flatMap(a -> a.stream());
		s.forEach(System.out::println);

	}

}
