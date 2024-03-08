package com.qa.main.exceptions;

public class Calculator {

	public void add(int x, int y) throws CantAddByFiveException {
		
		if (x == 5 || y == 5) {
			throw new CantAddByFiveException();
		}
		
		System.out.println(x + y);
	}
	
}
