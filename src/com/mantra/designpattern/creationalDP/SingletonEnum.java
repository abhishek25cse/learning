package com.mantra.designpattern.creationalDP;

enum Singleton {
	
	INSTANCE;
	
	public void doSingletonAction () {
		System.out.println("in method doSingletonAction ");
	}
	

}

public class SingletonEnum {

	public static void main(String[] a) {
		Singleton inst = Singleton.INSTANCE;
		Singleton inst2 = Singleton.INSTANCE;
		// check if both point to same object
		if (inst == inst2) {
			System.out.println("Success ");
		} else {
			System.out.println("Check ");
		}
		inst.doSingletonAction();

	}

}
