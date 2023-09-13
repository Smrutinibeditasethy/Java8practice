package com.datenineteentwentytwentyonetwentytwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//to find duplicate characters in the given string

public class DupilcateElements {

	public static void main(String[] args) {
String input = "ILoveToWatchShinchanWithMyFriends";
String[] s =input.split("");
//System.out.println(Arrays.toString(s));
Map<String, Long> map = Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//System.out.println(map);
List<String> dupu = map.entrySet().stream().filter(i -> i.getValue()==2).map( i -> i.getKey()).collect(Collectors.toList());
List<String> dupu1 = map.entrySet().stream().filter(i -> i.getValue()==3).map( i -> i.getKey()).collect(Collectors.toList());
List<String> dupu2 = map.entrySet().stream().filter(i -> i.getValue()==4).map( i -> i.getKey()).collect(Collectors.toList());
System.out.println(dupu );
System.out.println(dupu1);
System.out.println(dupu2);

	}

}
