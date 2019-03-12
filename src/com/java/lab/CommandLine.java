package com.java.lab;

public class CommandLine {

	public static void main(String[] args) {
		if (Integer.parseInt(args[0]) >= 0) {
			System.out.println("positive number");
		}
		else {
			System.out.println("negative number");
		}
	}
}
