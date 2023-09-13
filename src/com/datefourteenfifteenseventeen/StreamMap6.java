package com.datefourteenfifteenseventeen;

import java.util.Arrays;
import java.util.List;

//distinct ( )  => To get unique elements from the Stream

//limit ( long maxSize )  => Get elements from the stream based on given size

//skip (long n)  => It is used to skip given number of elements from starting position of the stream 

public class StreamMap6 {
public static void main(String[] args) {
	
	List<String> l = Arrays.asList("corejava", "advjava", "springboot", "restapi", "microservices");

	//l.stream().distinct().forEach(System.out::println);
	//l.stream().limit(4).forEach(System.out::println);
	l.stream().skip(2).forEach(System.out::println);
}
}
