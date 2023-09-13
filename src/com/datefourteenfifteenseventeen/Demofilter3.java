package com.datefourteenfifteenseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demofilter3 {
public static void main(String[] args) {

	User1 u1 = new User1("Smruti", 25);
	User1 u2 = new User1("Mouli", 27);
	User1 u3 = new User1("Raja", 22);
	User1 u4 = new User1("Rani", 10);
	User1 u5 = new User1("Mohan", 35);
	User1 u6 = new User1("Ashok", 30);
	
	Stream<User1> s = Stream.of(u1, u2, u3, u4, u5, u6);
	
	//age above 23
	//s.filter(i -> i.age >=23).forEach(System.out::println);
	
	//age below 23 and name starts with R
	s.filter(i -> i.age <=23 && i.name.startsWith("R")).forEach(System.out::println);
	
}
}
