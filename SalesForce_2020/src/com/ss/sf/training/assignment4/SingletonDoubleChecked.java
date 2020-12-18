/**
 * assignment 4 part 1: singleton double checked
 */
package com.ss.sf.training.assignment4;

/**
 * @author abelldm
 *
 */
public class SingletonDoubleChecked {

	volatile public static SingletonDoubleChecked instance = null;
	
	private SingletonDoubleChecked() {
		
	}
	
	public static SingletonDoubleChecked getInstance() {
		synchronized (instance) {
			if (instance == null) {
				instance = new SingletonDoubleChecked();
			}
		}
		return instance;
	}
	
}
