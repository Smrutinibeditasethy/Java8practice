package com.datesevenninetwelve;

import java.util.StringJoiner;

//Example of StringJoiner

public class Demo18 {
public static void main(String[] args) {
	StringJoiner sj = new StringJoiner("@");
	sj.add("Smruti");
	sj.add("Nibedita");
	sj.add("Sethy");
	System.out.println(sj);
	
	StringJoiner sj1 = new StringJoiner("@", "-", "%");
	sj1.add("Smruti");
	sj1.add("Nibedita");
	sj1.add("Sethy");
	System.out.println(sj1);
}
}
