package com.datesevenninetwelve;

import java.util.function.Supplier;

public class Demo8 {
public static void main(String[] args) {
	
	Supplier<String> s =() -> {
		String otp = "";
		for(int i = 1; i<=6; i++) {
	otp = otp + (int)(Math.random()*10);
		}
		return otp;
	};
	System.out.println(s.get());
}
}
