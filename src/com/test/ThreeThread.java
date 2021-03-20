package com.test;

public class ThreeThread  {	
	
	public static void main(String[] a) {
		
		ThreeThreadUse t = new ThreeThreadUse();
		/*
		 * ThreeThreadUse tr = new ThreeThreadUse(); ThreeThreadUse tm= new
		 * ThreeThreadUse();
		 */
		
		Thread t1 = new Thread(t, "zero");
		Thread t2 = new Thread(t, "one");
		Thread t3 = new Thread(t, "two");
		t1.start();
		t2.start();
		t3.start();
		
	}
}






