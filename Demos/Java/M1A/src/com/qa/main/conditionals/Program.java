package com.qa.main.conditionals;

public class Program {

	public static void main(String[] args) {

		int num = 5;

		// If there's only one line, you don't need the curly braces {}
		if (num > 10) {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}

		String season = "Winter";

		// The if and if else blocks check 3/4 seasons
		// This means the "else" block handles the only remaining season, which is
		// autumn
		if (season.equals("Winter")) {
			System.out.println("It's cold");
		} else if (season.equals("Summer")) {
			System.out.println("It's hot");
		} else if (season.equals("Spring")) {
			System.out.println("It's warm");
		} else {
			System.out.println("It's meh");
		}

		int x2 = -5;

		if (x2 >= 0)
			; // immediately ended

		{
			System.out.println(x2); // block of code that will run no matter what
		}

		System.out.println(x2); // This will run to

		int score = 3;

		// when checking a single value, you could use if/else if/else blocks
		if (score == 1) {
			System.out.println("Score is 1");
		} else if (score == 2) {
			System.out.println("Score is 2");
		} else if (score == 3) {
			System.out.println("Score is 3");
		} else if (score == 4) {
			System.out.println("Score is 4");
		} else if (score == 5) {
			System.out.println("Score is 5");
		} else {
			System.out.println("Score is something else");
		}

		// Or you could write it as a switch/case block
		switch (score) {
		case 1:
			System.out.println("Score is 1");
			break;
		case 2:
			System.out.println("Score is 2");
			break;
		case 3:
			System.out.println("Score is 3");
			break;
		case 4:
			System.out.println("Score is 4");
			break;
		case 5:
			System.out.println("Score is 5");
			break;
		default:
			System.out.println("Score is something else");
		}
	}

}
