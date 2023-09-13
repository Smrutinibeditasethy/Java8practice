package com.map;

import java.util.Arrays;

public class Demo3 {
public static void main(String[] args) {
	Arrays.asList("4", "8", "9", "5", "8").stream().map(n-> Integer.parseInt(n)).forEach(n-> System.out.println(n));
}
}
