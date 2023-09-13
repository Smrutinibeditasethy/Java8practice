package com.map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) throws IOException {
	
	System.out.println("==========1=============================================================");

    //1. Integers  using Integer stream
		IntStream.range(0, 10).forEach(System.out::println);
		
	System.out.println("==========2=============================================================");
	
	//2. Integer stream with skip
	
	IntStream.range(0, 10).skip(3).forEach(System.out::println);
	
	System.out.println("==========3=============================================================");
	//3. Integer stream with sum
	
	int sum = IntStream.range(0, 10).sum();
	System.out.println(sum);
	
	System.out.println("==========4=============================================================");
	//4.Stream.of, sorted, findFirst
	Optional<String> first = Stream.of("Smruti", "Mouli", "Bubu").sorted().findFirst();
	if (first.isPresent()) {
		System.out.println(first.get());
	}
		
		
	System.out.println("==========5=============================================================");
	
	//5.Stream from array, sort, filter,print
	String[] name = {"Smruti", "Mouli", "Riya", "Mira", "Sarika", "mahi", "juhi", "Sujata", "pooja"};
	Arrays.stream(name)
	.filter(i -> i.startsWith("M"))
	.sorted()
	.forEach(System.out::println);
	
	System.out.println("==========6=============================================================");

	//6.average of square of an int[]
	
	 Arrays.stream(new int[] {2, 4, 6, 8, 10, 12}).map(i -> i*i).average().ifPresent(System.out::println);
	
	
	System.out.println("==========7=============================================================");

	//7.Stream from List,map, filter and print
	
	List<String> l = Arrays.asList("Smruti", "Mouli", "Riya", "Mira", "Sarika", "mahi", "juhi", "Sujata", "pooja");
	l.stream().map(String::toLowerCase).filter(i -> i.startsWith("m")).forEach(System.out::println);
	
	System.out.println("==========8=============================================================");

	//8.Stream rows from a text file sort, filter, print
	
	Stream<String> bands = Files.lines(Paths.get("band.txt"));
	bands.sorted().filter(i -> i.length() >13).forEach(System.out::println);
	bands.close();
	
	System.out.println("==========9=============================================================");

	//9.streams rows from text file and save to list
	
	List<String> letters = Files.lines(Paths.get("band.txt")).filter(i -> i.contains("it")).collect(Collectors.toList());
	System.out.println(letters);
	
	System.out.println("==========10=============================================================");

	//10. stream rows from CSV file, (data.txt) and count
	
	Long count = Files.lines(Paths.get("data.txt")).collect(Collectors.counting());
	System.out.println(count);
	
	System.out.println("==========11=============================================================");

	//11. streams rows from csv file, parse data from rows
	
	Stream<String> row =Files.lines(Paths.get("data.txt"));
	row.map(i -> i.split(",")).filter(i -> i.length==3).filter(i -> Integer.parseInt(i[1])>15).forEach(j -> System.out.println(j[0] +" " +j[1] +" " +j[2]));
	row.close();
	
	System.out.println("==========12=============================================================");

	//12.streams rows from csv file, store fields in hashmap
	
	Stream<String> row1 =Files.lines(Paths.get("data.txt"));
	Map<String, Integer> m1 = new HashMap<>();
	row1.map(null)
	
	
	System.out.println("==========12=============================================================");

	
	
	
	
	}
	}
