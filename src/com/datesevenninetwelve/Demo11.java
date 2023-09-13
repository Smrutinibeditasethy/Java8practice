package com.datesevenninetwelve;

import java.util.function.BiPredicate;

public class Demo11 {
public static void main(String[] args) {
	BiPredicate<Integer, String> bi = (i, j) -> {
	if(i==Integer.parseInt(j)) {
		return true;
	} else
		return false;	
	};
	System.out.println(bi.test(3, "3"));
}
}
