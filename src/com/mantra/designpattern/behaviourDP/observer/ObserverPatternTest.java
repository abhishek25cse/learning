package com.mantra.designpattern.behaviourDP.observer;

public class ObserverPatternTest {

	public static void main(String[] args) {
		
		Subject subj = new Subject(10);
		IObserver binaryObser = new BinaryObserver(subj);
		IObserver decimalObser = new DecimalObserver(subj);
		System.out.println("Observer Count ="+subj.getObservers().size());		
		subj.setState(20);
		
		

	}

}
