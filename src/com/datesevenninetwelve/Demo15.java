package com.datesevenninetwelve;

import java.util.function.Function;

@FunctionalInterface
interface MyBumbu{
	Bumbu getBumbu(String name);
}


public class Demo15 {
public static void main(String[] args) {
	
	//Bumbu b = new Bumbu("Smruti", 25);
	
	MyBumbu mb = Bumbu::new;
	Function<String, Bumbu> f = Bumbu::new;
	Function<String, Bumbu> f1 = name -> new Bumbu(name);

	System.out.println(mb.getBumbu("Smruti").getName());
	System.out.println(f.apply("Hai").getName());
	System.out.println(f1.apply("HUff").getName());

}
}
