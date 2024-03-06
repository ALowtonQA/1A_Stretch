package com.qa.main.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		int[] numbers = {5, 3, 6, 7, 1};
		
		Arrays.sort(numbers);
		
		// loops
		for(int num : numbers) {
			System.out.println(num);
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// Arraylists
		ArrayList<Integer> numbers2 = new ArrayList<>(); // any length
		
		numbers2.add(5);
		numbers2.add(10);
		numbers2.add(15);
		
		System.out.println(numbers2.size());
		
		numbers2.add(25);
		numbers2.add(50);
		
		System.out.println(numbers2.size());
		
		numbers2.remove(0);
		
		System.out.println(numbers2.size());
		
		for (int num : numbers2) {
			System.out.println(num);
		}
		
		for (int i = 0; i < numbers2.size(); i++) {
			System.out.println(numbers2.get(i));
		}
	}
}
