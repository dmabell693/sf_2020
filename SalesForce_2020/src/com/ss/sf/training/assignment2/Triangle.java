/**
 * 
 */
package com.ss.sf.training.assignment2;

/**
 * @author abelldm
 *
 */
public class Triangle implements Shape {

	/**
	 * @param args
	 */

	double base = 2;
	double height = 3.14;
	
	@Override
	public void calculateArea() {
		System.out.print((base * height) / 2);
	}

	@Override
	public void display() {
		System.out.println("Looks like a tent");
	}

}
