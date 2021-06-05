package com.mantra.java8.poc.basic;

enum Month {
	JANUARY(1),
	FEBRUARY(2);

	int monthValue;
	Month(int value) {
		monthValue = value;
	}
	public int getMonthValue() {
		return monthValue;
	}
	
}

public class EnumDemo{
	public static void main(String[] a) {
		System.out.println(Month.JANUARY.getMonthValue());
	}
}
