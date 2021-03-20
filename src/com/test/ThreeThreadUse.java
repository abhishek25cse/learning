package com.test;

public class ThreeThreadUse implements Runnable {

	static volatile int target = 10;
	static volatile int count = 1;

	@Override
	public void run() {
		TurnManagerClass tM = new TurnManagerClass();
		try {
			tM.turnManager();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	
	/*
	 * public synchronized void printItA() {
	 * System.out.println(Thread.currentThread().getName() + "   " + count);
	 * count++; try { wait(10); notifyAll(); } catch (InterruptedException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } }
	 * 
	 * public synchronized void printItB() {
	 * System.out.println(Thread.currentThread().getName() + "   " + count);
	 * count++; try { wait(10); notifyAll(); } catch (InterruptedException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } }
	 */

}
