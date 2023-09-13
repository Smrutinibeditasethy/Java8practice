package com.datesevenninetwelve;

import java.util.function.Function;

public class Demo10 {
public static void main(String[] args) {
	/*Function<String,  Integer> f = name -> name.length();
	
	System.out.println(f.apply("Smruti"));
	System.out.println(f.apply("SmrutiNibedita"));
	System.out.println(f.apply("SmrutiNibeditaSethy"));
	System.out.println(f.apply("SmrutiMouliShankar"));*/
	
	Function<String, String> f = name -> name.toUpperCase();
	
	System.out.println(f.apply("smruti"));
	System.out.println(f.apply("smrutiNibedita"));
	System.out.println(f.apply("smrutiNibeditaSethy"));
	System.out.println(f.apply("smrutiMouliShankar"));
}
}
