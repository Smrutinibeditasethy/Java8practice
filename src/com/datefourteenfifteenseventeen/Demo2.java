package com.datefourteenfifteenseventeen;

//optional.of()
//when we know that the object is not null

import java.util.Optional;

public class Demo2 {
public static void main(String[] args) {
	Customer c = new Customer(10, "Dumbu", "Dumbu@abc.com");
	Customer c1 = new Customer(11, "Disco", "Disco@abc.com");

	Optional<String> eo = Optional.of(c.getEmail());
	System.out.println(eo);
}
}
