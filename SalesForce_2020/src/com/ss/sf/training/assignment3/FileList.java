/**
 * assignment 3 part 1: list files in a given directory
 */
package com.ss.sf.training.assignment3;

import java.io.File;

/**
 * @author abelldm
 *
 */
public class FileList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File exFile = new File("/Users/abelldm/Desktop");
		
		String[] fileList = exFile.list();
		
		for(String a : fileList) {
			System.out.println(a);
		}
		
	}

}
