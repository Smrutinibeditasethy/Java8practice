package com.datenineteentwentytwentyonetwentytwo;

public class Person {
String name;
String subject;
public Person(String name, String subject) {
	this.name = name;
	this.subject = subject;
}
@Override
public String toString() {
	return "Person name=" + name + ", subject=" + subject;
}

}
