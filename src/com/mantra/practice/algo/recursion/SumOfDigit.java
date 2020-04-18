package com.mantra.practice.algo.recursion;

/*Write a recursive function that, given a number n, returns the sum of the digits of the
number n.*/
public class SumOfDigit {

	public static void main(String[] args) {
		System.out.print(sumOfDigit(123));

	}
	
	static public int sumOfDigit(int n) {
		if(n/10 == 0) {
			return n;
		} else {
			return (n%10)+sumOfDigit(n/10);
		}
	}

}
