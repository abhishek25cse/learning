package com.test.socgen;

import java.util.concurrent.ExecutorService;

public class CheckDeadLock {

	public static void main(String[] args) {
		
		Runnable r1 = ()-> {
			ClassA b = new ClassA();
			b.methodB();
		};
		
		Runnable r2 = ()-> {
			ClassA a = new ClassA();
			a.methodA();
		};
		
		Thread t1 = new Thread(r1);

		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		
		// *ExecutorService ex = ExecutorService.*/
				
				// are i anesdasdasd
		
		
	}
	
	
	
	

}
