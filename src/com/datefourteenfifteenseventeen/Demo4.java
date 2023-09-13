package com.datefourteenfifteenseventeen;

import java.util.Optional;

//isPresent()
//This check wheather the object has a null value or not 
// we can also use orElse in place of if else 
public class Demo4 {
public static void main(String[] args) {
	Customer c = new Customer(10, "Dumbu", null);
	Customer c1 = new Customer(11, "Disco", "Disco@abc.com");
	
	
	Optional<String> emailOptional2 = Optional.ofNullable(c.getEmail());
	
/*	if (emailOptional2.isPresent()) {
		System.out.println(emailOptional2.get());
	}else {
		System.out.println("No email data found");
	}*/
	
	System.out.println(emailOptional2.orElse("NO email found"));
}
}
