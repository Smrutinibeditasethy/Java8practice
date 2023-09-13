package com.datesevenninetwelve;

import java.util.function.BiFunction;

public class Demo12 {
public static void main(String[] args) {
	
	BiFunction<Integer, Integer, Integer> bi = (num1, num2) -> num1 + num2 ;
	
	Integer a =bi.apply(12, 3);
	Integer b =bi.apply(15, 9);

	System.out.println(a);
	System.out.println(b);
	}
}

