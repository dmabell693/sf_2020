/**
 *  * assignment 4 part 3: producer consumer threads
 */
package com.ss.sf.training.assignment3;

import java.util.LinkedList;
/**
 * @author abelldm
 *
 */
public class ProduceConsumeThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args)
		throws InterruptedException {
			final ProdCons prodcons = new ProdCons();
			
			Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						prodcons.produce();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			
			Thread t2 = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						prodcons.consume();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			
		}
		
		
		public static class ProdCons {
			LinkedList<Integer> list = new LinkedList<>();
			int maxcap = 2;
			
			public void produce() throws InterruptedException {
				int value = 0;
				while (true) {
					synchronized (this) {
						while (list.size() == maxcap)
							wait();
						
						System.out.println("Producer produced: " + value);
						
						list.add(value++);
						
						notify();
						
						Thread.sleep(1000);
					}
				}
			}
			
			public void consume() throws InterruptedException {
				while (true) {
					synchronized (this) {
						while (list.size() == 0)
							wait();
						
						int val = list.removeFirst();
						
						System.out.println("Consumer consumed: " + val);
						
						notify();
						
						Thread.sleep(1000);
					}
				}
			}
		}
	}


