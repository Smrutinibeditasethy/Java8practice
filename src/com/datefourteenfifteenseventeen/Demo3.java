package com.datefourteenfifteenseventeen;

//Optional.ofNullable() example
//when we don't know that the object is null or non null the we will use this
import java.util.Optional;

public class Demo3 {
public static void main(String[] args) {
	Customer c = new Customer(10, "Dumbu", null);
	Customer c1 = new Customer(11, "Disco", "Disco@abc.com");
	
	Optional<String> emailoptional2 = Optional.ofNullable(c.getEmail());
	System.out.println(emailoptional2);
}
}
