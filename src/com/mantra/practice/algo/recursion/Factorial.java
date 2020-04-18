package com.mantra.practice.algo.recursion;

/*Write a recursive implementation of the factorial function. Recall that n! = 1 × 2 × … × n,
with the special case that 0! = 1.*/
public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	public static int factorial(int i) {
		if(i<=1) return 1;
		else return i*factorial(i-1);		
	}
}
