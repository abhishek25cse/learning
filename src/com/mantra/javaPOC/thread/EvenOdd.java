package com.mantra.javaPOC.thread;

public class EvenOdd {
	public static void main(String[] a) {
		OddEvenMoniter r1 = new OddEvenMoniter();
		Thread odd = new Thread(r1, "Odd");
		Thread even = new Thread(r1, "Even");
		odd.start();
		even.start();
	}

}

class OddEvenMoniter implements Runnable {
	public static  int count = 0;

	@Override
	public void run() {
		while (count < 20) {
			try {
				turnManager();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public  void printEven() throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"----" + count);	
	}

	public  void printOdd() throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"		------" + count);		
	}

	public synchronized void turnManager() throws InterruptedException {
		if (count % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
			try {
				this.printEven();
				count++;
				wait(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
		} else if(count % 2 == 1 && Thread.currentThread().getName().equals("Odd")) {
			try {
				this.printOdd();
				count++;
				notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} else {
			//System.out.println("SKIP**************");
		}
	}

}
