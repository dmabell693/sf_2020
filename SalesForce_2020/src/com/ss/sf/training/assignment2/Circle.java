/**
 * 
 */
package com.ss.sf.training.assignment2;

/**
 * @author abelldm
 *
 */
public class Circle implements Shape {

	/**
	 * @param args
	 */

	double circumference = 2;
	double pi = 3.14;
	
	@Override
	public void calculateArea() {
		System.out.print(circumference * pi);
	}

	@Override
	public void display() {
		System.out.println("Looks like a circle");
	}

}
