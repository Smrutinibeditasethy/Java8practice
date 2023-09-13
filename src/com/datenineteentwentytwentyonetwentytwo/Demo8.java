package com.datenineteentwentytwentyonetwentytwo;

import java.util.Arrays;

//sum reduce() method

public class Demo8 {
public static void main(String[] args) {
	int[] num= {1, 2, 3, 4, 5, 6};
	
	int reduce = Arrays.stream(num).reduce(0, (a, b) -> a+b);
System.out.println("The reduce vale is : " +reduce);	

}
}
