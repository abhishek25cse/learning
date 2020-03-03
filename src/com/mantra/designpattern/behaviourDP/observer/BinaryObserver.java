package com.mantra.designpattern.behaviourDP.observer;

public class BinaryObserver extends IObserver {

	
	public BinaryObserver(Subject subj) {
		this.subject = subj;
		subj.attachObs(this);
	}

	@Override
	public void update() {
	System.out.println("update from BinaryObserver="+subject.getState());

	}

}
