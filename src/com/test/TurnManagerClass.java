package com.test;

public class TurnManagerClass {
	static volatile int target = 10;
	static volatile int count = 1;
	
	public synchronized void turnManager() throws InterruptedException {
		int rem = count % 3;
		while (count < target) {
			try {
				if (rem == 0 && Thread.currentThread().getName().equals("zero")) {
					printIt();			
					count++;
					wait();
					
				} else if (rem == 1 && Thread.currentThread().getName().equals("One")) {
					printIt();	
					count++;
					wait();
				} else if (rem == 2 && Thread.currentThread().getName().equals("two")) {
					printIt();	
					count++;
					wait();
				}
				notify();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	

	}
	
	public void printIt() {
		System.out.println("Enter thread "+Thread.currentThread().getName());		
		System.out.println(Thread.currentThread().getName() + "   " + count);
		

	}

}
