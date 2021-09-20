package com.test.socgen;

public class ClassA {
	
	
	 
	public void methodA() {
		synchronized (ClassA.class) {
			System.out.println("Method A");
			
			this.methodB();
		}
		
	}
	
	public void methodB() {
		synchronized (ClassA.class) {
			System.out.println("Method B");			
			this.methodA();
		}
		
		
	}


}
