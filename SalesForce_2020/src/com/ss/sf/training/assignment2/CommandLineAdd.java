/**
 * assignment 2 part 1: take values from command line and add them
 */
package com.ss.sf.training.assignment2;

import java.util.Scanner;

/**
 * @author abelldm
 *
 */
public class CommandLineAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// establish scanner to read user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter some numbers into the command line: ");
				
		// point user input to memory address
		String userInput = scanner.nextLine();
		// convert user input into string array
		String[] inputArr = userInput.split(" ");
		
		// declare variable to hold total
		double total = 0;
		
		// advanced for loop to iterate through input array
		for (String a : inputArr) {
			// convert each index into double
			double dnum = Double.parseDouble(a);
			// add each converted double to total
			total += dnum;
		}
		
		System.out.println("The total sum of your numbers is: " + total);
		
		scanner.close();
	}
}
