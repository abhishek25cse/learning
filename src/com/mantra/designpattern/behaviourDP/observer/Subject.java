package com.mantra.designpattern.behaviourDP.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<IObserver> observers = new ArrayList<IObserver>();
	private int state;
	
	public Subject(int state) {
		this.state = state;
	}
	
	public List<IObserver> getObservers() {
		return observers;
	}
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObs();
	}
	
	public void attachObs(IObserver obs) {
		observers.add(obs);
	}
	
	public void notifyAllObs() {
		observers.stream().forEach(obs->obs.update());
	}

}
