package com.qa.main.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public void readFile() throws FileNotFoundException, IOException {
		File file = new File("src/com/qa/main/exceptions/file.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
	}
}
