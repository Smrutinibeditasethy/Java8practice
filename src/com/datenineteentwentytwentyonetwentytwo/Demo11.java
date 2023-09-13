package com.datenineteentwentytwentyonetwentytwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//to get the elements present in the odd position

public class Demo11 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" );
IntStream.range(0, list.size()).filter(i -> i%2==1).mapToObj(i -> list.get(i)).forEach(i -> System.out.println(i));
	}

}
