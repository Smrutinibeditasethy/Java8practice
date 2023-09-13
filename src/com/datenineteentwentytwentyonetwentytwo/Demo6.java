package com.datenineteentwentytwentyonetwentytwo;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

//splititerator


public class Demo6 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Smruti", "Mouli", "Deepika", "Ajay", "Nani");
	Spliterator<String> si = names.stream().spliterator();
	si.forEachRemaining(n -> System.out.println(n));
}
}
