package com.mantra.javaPOC.thread;

public class EvenOdd {

	public static volatile Integer count = 0;

	public synchronized void printEven() throws InterruptedException {
		System.out.println("Even " + count);
		wait(100);
	}

	public synchronized void printOdd() throws InterruptedException {
		System.out.println("Odd 	" + count);
		notifyAll();
	}
	
	public static synchronized void turnManager() throws InterruptedException {
		EvenOdd eo = new EvenOdd();
		synchronized (count) {
			if (count % 2 == 0) {
				try {
					eo.printEven();
					count++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				try {
					eo.printOdd();
					count++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] a) {		
		Runnable r1 = () -> {
			while (count < 20) {
				try {
					EvenOdd.turnManager();
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}
		};
		Thread odd = new Thread(r1);
		Thread even = new Thread(r1);
		odd.start();
		even.start();
	}

}
