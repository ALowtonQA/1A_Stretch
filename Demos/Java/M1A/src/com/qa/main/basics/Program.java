package com.qa.main.basics;

public class Program {
	
	public static void main(String[] args) {

		// THIS IS A COMMENT

		/*
		 * This is a multiline comment
		 */

		System.out.println("hello");
		System.out.println("there");
		System.out.println("class");
		
		// variable declaration
		int age;
		
		// variable initialisation
		age = 30;
		
		// reassignment
		age = 31;
		
		// long way
//		int i = 0;
//		int j = 1;
//		
		//short way
		int i = 0, j = 1;
		
		System.out.println(i);
		System.out.println(j);
		
		boolean flag = false;

		// Primitive version of short (no methods, just value)
//		short myAge = 30;
		
		// Object version of short (comes with useful methods which can be seen by typing myAge.)
		Short myAge = 30;
		
		String ageString = "30";
		
		int convertedAge = Integer.parseInt(ageString);
		
		System.out.println(convertedAge + 1);	
		
	}
}
