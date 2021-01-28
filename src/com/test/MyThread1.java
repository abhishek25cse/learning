package com.test;

public class MyThread1 implements Runnable {
	public  static int  i = 1;
	public static int target = 20;

	@Override
	public void run() {
		try {
			while (i < target) {
			   this.turnManager();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	public synchronized void turnManager() throws InterruptedException {		
			if (i % 2 == 0) {
				printEvenNumber();
				i++;		
				this.wait(10);				
				//this.notify();
			} else {
				printOddNumber();
				i++;		
				this.wait(10);
				//this.notify();
			}
			
		
	}
	public  void printEvenNumber() {		
			System.out.println(Thread.currentThread().getName()+"            " + i);
			
	}
	
	public  void printOddNumber() {		
		System.out.println(Thread.currentThread().getName()+"   " + i);		
}

}
