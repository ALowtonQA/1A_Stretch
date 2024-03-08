package com.qa.main.labs.lab13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		Account myAccount = new Account(1, 100, "Anoush");
		
		try {
			myAccount.withdraw(50);
			System.out.println(myAccount.getDetails());
			myAccount.withdraw(60);
			System.out.println(myAccount.getDetails());
		} catch (IllegalArgumentException e) {
			try {
				log(e.getMessage());
			} catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		} finally {
			myAccount.close();
		}
	}
	
	private static void log(String msg) throws IOException {
		File file = new File("src/com/qa/main/labs/lab13/log.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(msg + "\r\n");
		br.close();
		fr.close();
	}


}
