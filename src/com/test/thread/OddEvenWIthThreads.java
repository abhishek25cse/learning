package com.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

/*
Use three thread to print numbers 1-target sequencly with 3 threads

Approach 1 # use AtomicInteger
*/
public class OddEvenWIthThreads {

	private static AtomicInteger count = new AtomicInteger(0);
	private static final Integer target = 20;

	public static synchronized void incrementCount() {
		System.out.println( count.getAndIncrement()+"  "+Thread.currentThread().getName() );

	}

	public static void main(String[] args) {
		Runnable r = () -> {
			while (count.get() < target) {

				if (Thread.currentThread().getName().contains("zero") && count.get() % 4 == 0) {
					OddEvenWIthThreads.incrementCount();
				} else if (Thread.currentThread().getName().contains("one") && count.get() % 4 == 1) {
					OddEvenWIthThreads.incrementCount();
				} else if (Thread.currentThread().getName().contains("two") && count.get() % 4 == 2) {
					OddEvenWIthThreads.incrementCount();
				} else if (Thread.currentThread().getName().contains("three") && count.get() % 4 == 3) {
					OddEvenWIthThreads.incrementCount();
				}

				/*
				 * if (count.get() % 4 == 0) { OddEvenWIthThreads.incrementCount(); } else if
				 * (count.get() % 4 == 1) { OddEvenWIthThreads.incrementCount(); } else
				 * if(count.get() % 4 == 2) { OddEvenWIthThreads.incrementCount(); } else
				 * if(count.get() % 4 == 3) { OddEvenWIthThreads.incrementCount(); }
				 */
			}

		};

		Thread t1 = new Thread(r, "	zero	");
		Thread t2 = new Thread(r, "		one		");
		Thread t3 = new Thread(r, "			two			");
		Thread t4 = new Thread(r, "				three				");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
