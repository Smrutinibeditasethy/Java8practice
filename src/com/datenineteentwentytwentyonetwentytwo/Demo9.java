package com.datenineteentwentytwentyonetwentytwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo9 {
public static void main(String[] args) throws IOException {
	String filename = "info.txt";
	
	try (Stream<String> stream = Files.lines(Paths.get(filename))) {
		stream.forEach(line -> System.out.println(line));
	}catch (Exception e) {
      e.printStackTrace();
     }
   }
}
