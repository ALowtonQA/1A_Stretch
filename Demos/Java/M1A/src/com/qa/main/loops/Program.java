package com.qa.main.loops;

public class Program {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5}; // 0-indexed array of 5 ints

		System.out.printf("The length of the array is %d\n", numbers.length);
		System.out.printf("The value at index 0 is %d\n", numbers[0]);
		
		numbers[0] = 10; // changed value
		
		System.out.printf("The value at index 0 is %d", numbers[0]);
		
		int[] numbers2 = new int[5]; // new int[length] creates an array with a length of 5
		
		System.out.printf("The length of the array 2 is %d\n", numbers2.length);
		
		System.out.printf("The value at index 0 of array 2 is %d\n", numbers2[0]);
		
		boolean flag = false;
		
		while(flag == true) {
			System.out.println("Don't see this");
		}
		
		do {
			System.out.println("See this at LEAST once");
		} while(flag == true);
		
		// loop through array numbers defined at the top
//		int i = 0;
//		while(i < numbers.length) {
//			System.out.println(numbers[i]);
//			i++; // i += 1 -> i = i + 1
//		}
		
//		for(initial val; condition;  increment)
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for (int i = 0; i < 5; i++) {
			
			if (i == 2) {
				continue;
			}
			
			System.out.println("The value of i is: " + i); // 0, 1, 3, 4
		}	
		
		// Enhanced for loops use read-only values, cannot be used to change underlying array data 
			String[] names = {"Bob","Sasha"};
			
			for (String name : names) {
				name = name + "x";
			}
			
			System.out.println(names[0]);
			
			
			// If you want to target and change the underlying array data when looping, use a normal loop:
			for (int k = 0; k < names.length; k++) {
				names[k] = names[k] + "x";
			}
			
			System.out.println(names[0]);
	}
}
