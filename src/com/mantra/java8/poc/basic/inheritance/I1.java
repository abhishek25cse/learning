package com.mantra.java8.poc.basic.inheritance;

public interface I1 {
	default void m() {
		System.out.println("I1 ");
	}
	
	void getDetail();


}
