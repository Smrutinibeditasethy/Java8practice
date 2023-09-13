package com.map;

import java.util.Arrays;

//Write the program for max and min sum of the given array

public class Demo {

	public static void main(String[] args) {
int[] arr = {1, -5, 3, 14, -2, 17, 19};

int firstMinNum = Arrays.stream(arr).sorted().skip(1).findFirst().orElse(0);
System.out.println("The lowest num = " +firstMinNum);
int secondMaxNum = Arrays.stream(arr).sorted().skip(arr.length-2).findFirst().orElse(0);
System.out.println("The highest num = " +secondMaxNum);

 int sum = firstMinNum + secondMaxNum;
 System.out.println(sum);



	}

}
