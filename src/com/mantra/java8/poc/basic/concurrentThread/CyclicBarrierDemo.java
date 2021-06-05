package com.mantra.java8.poc.basic.concurrentThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

	

	private void removeAnimals() {
		System.out.println("Removing animals");
	}

	private void cleanPen() {
		System.out.println("Cleaning the pen");
	}

	private void addAnimals() {
		System.out.println("Adding animals");
	}

	public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			removeAnimals();
			c1.await();
			cleanPen();
			c2.await();
			addAnimals();
		} catch (InterruptedException | BrokenBarrierException e) {
			// Handle checked exceptions here
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			CyclicBarrierDemo manager = new CyclicBarrierDemo();
			CyclicBarrier c1 = new CyclicBarrier(4, () -> System.out.println("*** Animal Removed!"));
			CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));

			for (int i = 0; i < 4; i++)
				service.submit(() -> manager.performTask(c1, c2));
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
