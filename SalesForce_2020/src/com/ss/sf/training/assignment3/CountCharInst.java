/**
 * assignmet 3 part 3: count characters in a file
 */
package com.ss.sf.training.assignment3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author abelldm
 *
 */
public class CountCharInst {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner comLinScanner = new Scanner(System.in);
		
		System.out.println("Hello, user. Please type a single character (e.g. 'e') whose occurrences in a given file you would like to count");
		
		String userInput = comLinScanner.next().toLowerCase();

		System.out.println("You chose: " + userInput);

		File exFile = new File("/Users/abelldm/Desktop/FileWriterExample.txt");
		Scanner forExFile = new Scanner(exFile);
		
		int count = 0;
		String line = "";
		
		while(forExFile.hasNextLine()) {
			
			line = forExFile.nextLine();
						
			for (int i = 0; i < line.length(); i++) {
				String letter = line.substring(i, (i + 1)).toLowerCase();
				
				if (letter.contains(userInput)) {
					count++;
				}
			}
		}
		
		System.out.println("The total number of occurences of "+userInput+" in this file is: "+ count);
		
		comLinScanner.close();
		forExFile.close();
	}

}
