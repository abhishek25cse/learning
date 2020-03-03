package com.mantra.designpattern.behaviourDP.observer;

public class DecimalObserver extends IObserver {


	public DecimalObserver(Subject subj) {
		this.subject = subj;
		subj.attachObs(this);
	}

	@Override
	public void update() {
	System.out.println("update from DecimalObserver="+subject.getState());

	}


}
