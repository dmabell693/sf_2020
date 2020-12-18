/**
 * assignment 4 part 2: deadlock between two threads
 */
package com.ss.sf.training.assignment4;

/**
 * @author abelldm
 *
 */
public class DeadLock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String firstString = "Here is the first string.";
		String secondString = "Second string here.";
		System.out.println("Start example");
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (firstString) {
						Thread.sleep(100);
						synchronized (secondString) {
							System.out.println("Thread 1 woke");
					}
						}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (secondString) {
						Thread.sleep(100);
						synchronized (firstString) {
							System.out.println("Thread 2 woke");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		
		System.err.println("----End Program----");
		
	}

}
