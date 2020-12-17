/**
 * assignment 3 part 2: append text to file
 */
package com.ss.sf.training.assignment3;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author abelldm
 *
 */
public class AppendText {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		String newText = "\nThis is the appended text!";
		
		FileWriter out = new FileWriter("/Users/abelldm/Desktop/FileWriterExample.txt", true);
		
		out.append(newText);
		out.close();
	}

}
