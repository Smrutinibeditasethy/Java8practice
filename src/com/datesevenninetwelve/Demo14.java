package com.datesevenninetwelve;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo14 {
public static void main(String[] args) {
	//Dumbu d = new Dumbu("Smrui"); // calling the constructor of Dumbu class
	Supplier<Dumbu> s = Dumbu::new;
	Dumbu dumbu = s.get();
	System.out.println(dumbu.hashCode());
	
}
}
