package com.qa.main.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		Reader reader = new Reader();
		Calculator calc = new Calculator();
		
		try {
			reader.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File wasn't found");
		} catch (IOException e) {
			System.out.println("Issue reading the file");
		}
		
		try {
			calc.add(10, 2);
			calc.add(5, 7);
		} catch (CantAddByFiveException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
