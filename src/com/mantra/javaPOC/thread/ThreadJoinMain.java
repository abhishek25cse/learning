package com.mantra.javaPOC.thread;

public class ThreadJoinMain {

	/* Program to start a thread after the previous is terminted or finished */
	public static void main(String[] args) throws InterruptedException {

		Runnable r = () -> {
			System.out.println("Thread executing ...."+Thread.currentThread().getName());
		};
		
		Thread t1 =  new Thread(r);
		Thread t2 =  new Thread(r);
		Thread t3 =  new Thread(r);
		Thread t4 =  new Thread(r);
		t1.start();		
		t1.join();
		System.out.println("t1.join");
		System.out.println(t1.getState().name() + "  "+ t2.getState().name()+
				"  "+t3.getState().name()+ "   "+t4.getState().name());
		
		t2.start();		
		t2.join();
		System.out.println("t2 join");
		System.out.println(t1.getState().name() + "  "+ t2.getState().name()+
				"  "+t3.getState().name()+ "   "+t4.getState().name());
		
		t3.start();		
		t3.join();
		System.out.println("t3 join");
		System.out.println(t1.getState().name() + "  "+ t2.getState().name()+
				"  "+t3.getState().name()+ "   "+t4.getState().name());
		
		t4.start();
		t4.join();
		System.out.println("t4 join ");
		System.out.println(t1.getState().name() + "  "+ t2.getState().name()+
				"  "+t3.getState().name()+ "   "+t4.getState().name());
		System.out.println("End main ");
		
		

	}

}
