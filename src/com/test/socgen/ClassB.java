package com.test.socgen;

public class ClassB {
	
	public synchronized void methodB() {
		System.out.println("Method B");
		ClassA a = new  ClassA();
		a.methodA();
		
	}

}
