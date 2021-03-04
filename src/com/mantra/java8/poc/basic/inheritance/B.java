package com.mantra.java8.poc.basic.inheritance;

public class B implements I1 , I2{
	
	void callMe() {
		m();
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		I1.super.m();
	}

	@Override
	public void getDetail() {
		// TODO Auto-generated method stub
		
	}
}
