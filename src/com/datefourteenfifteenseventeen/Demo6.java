package com.datefourteenfifteenseventeen;

import java.util.Optional;

public class Demo6 {
	public static void main(String[] args) {
		Customer c = new Customer(10, "Dumbu", null);
		Customer c1 = new Customer(11, "Disco", "Disco@abc.com");
		
		
		Optional<String> emailOptional2 = Optional.ofNullable(c.getEmail());
		
		System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "Default email"));
	}
}
