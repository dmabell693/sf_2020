/**
 * 
 */
package com.ss.sf.training.assignment2;

/**
 * @author abelldm
 *
 */
public class Rectangle implements Shape {

	/**
	 * @param args
	 */

	int length = 2;
	int width = 4;
	
	@Override
	public void calculateArea() {
		System.out.print(length * width);
	}

	@Override
	public void display() {
		System.out.println("Looks wider than longer");
	}

}
