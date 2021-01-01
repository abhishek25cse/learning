package com.mantra.java8.poc.basic;

public class OperatorBasic {
	
	public static void main(String[] a) {

		OperatorBasic.checkOpertor();
		
	}
	public static void checkOpertor() {
		System.out.println("*******************************************************");
		int i=10;
		int z = ++i;
		System.out.println(z+"= z = ++i " + i);
		z=i++;
		System.out.println(z+"= z = ++i  , here the value is first assigned to z and then the value of i is increemented " + i);
		System.out.println("*******************************************************");		
	}

}
