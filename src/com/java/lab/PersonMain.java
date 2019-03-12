package com.java.lab;
import java.time.LocalDate;

public class PersonMain {
	
	public static void main(String[] args) {
		Person person1 = new Person("Steven", "Benner", Gender.M, "(505)328-3679", LocalDate.of(1990, 2, 23));
		person1.personDetails();
	}

}
