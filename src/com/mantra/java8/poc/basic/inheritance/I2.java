package com.mantra.java8.poc.basic.inheritance;

public interface I2 {
	default void m() {
		System.out.println("I2 ");
	}
	
	void getDetail();


}
