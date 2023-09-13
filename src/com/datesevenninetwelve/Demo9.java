package com.datesevenninetwelve;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo9 {
public static void main(String[] args) {
	Consumer<String> c = name -> System.out.println(name + ", Good Morning");
	
	c.accept("Smruti");
	c.accept("Mouli");
	c.accept("Priya");
}
}
