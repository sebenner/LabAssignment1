package com.java.lab;
import java.time.LocalDate;
import java.time.Period;

enum Gender {
	M,F
}
public class Person {
	private String firstName;
	private String lastName;
	private Gender gender;
	private String phoneNumber;
	private int age;
	
	public Person(String firstName, String lastName, Gender gender, 
			      String phoneNumber, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.setAge(calculateAge(dateOfBirth));
	}
	
	public void personDetails() {
		System.out.format("Full name = %s, gender = %s, phoneNumber = %s, age = %d", 
				           getFullName(firstName, lastName), gender.toString(), phoneNumber, age);
	}
	
	public int calculateAge(LocalDate dateOfBirth) {
		LocalDate currDate = LocalDate.now();
		Period currAge = Period.between(dateOfBirth, currDate);
		return currAge.getYears();
	}
	
	public String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
