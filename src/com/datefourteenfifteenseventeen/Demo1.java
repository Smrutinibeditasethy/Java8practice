package com.datefourteenfifteenseventeen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class Demo1 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.println("Enter the Number : ");
	int num = Integer.parseInt(br.readLine());
	
	User u = new User();
	/*String ms = username.toUppercase() +", Hello";
	System.out.println(ms);*/
	
	Optional<String> username = u.getUsername(num);
	
	if (username.isPresent()) {
		String name = username.get();
		System.out.println(name.toUpperCase() +", Hello");
	}else {
		System.out.println("No data Found");
	}
}
}
