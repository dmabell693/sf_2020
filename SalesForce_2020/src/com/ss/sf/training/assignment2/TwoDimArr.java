/**
 * assignment 2 part 2: create 2d array, find max value and index of max value
 */
package com.ss.sf.training.assignment2;

/**
 * @author abelldm
 *
 */
public class TwoDimArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// construct the 2D array
		int[][] twoDArr = { { 3, 9, 19, 5 }, { 73 , 2, 8, 42 }, { 1, 59, 34, 22 } };
		
		// declare variables for max number, max number row, and max number col
		int maxNum = 0;
		int maxNumRow = 0;
		int maxNumCol = 0;
		
		// nest a for loop inside a for loop, first loop for row, second for column
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				// check each value against current max number
				// if max number, record row & column indices
				if (twoDArr[i][j] > maxNum) {
					maxNum = twoDArr[i][j];
					maxNumRow = i;
					maxNumCol = j;
				}
				
			}
			
		}
		
		System.out.println("Max number: " + maxNum);
		System.out.println("Max number index: 2D array[" + maxNumRow + "][" + maxNumCol + "]");
	}

}
