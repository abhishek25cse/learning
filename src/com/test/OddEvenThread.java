package com.test;

public class OddEvenThread {
// This does not work
	public static void main(String[] args) throws InterruptedException {
		MyThread1 odd = new MyThread1();

		Thread t1 = new Thread(odd, "One");
		Thread t2 = new Thread(odd, "Two");
		t1.start();
		t2.start();
	}

}
