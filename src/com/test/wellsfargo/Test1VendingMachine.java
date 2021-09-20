package com.test.wellsfargo;

import java.util.ArrayList;

public class Test1VendingMachine {

	public static void main(String[] args) {

			//System.out.println(recursiveSum(32));
		System.out.println(findDigits(32));

	}
	
	
	public static long recursiveSum(long i) {
		if(i<10) {
			return i*i;
		}
		long sum = ((i%10)*(i%10))+recursiveSum(i/10);
		if(sum>9) {
			sum = ((i%10)*(i%10))+recursiveSum(i/10);
		}
		return sum;
	}
	
	public static ArrayList<Long> findDigits(long i) {
		ArrayList<Long> digits = new ArrayList<Long>();
		
		while (i/10 != 0) {
			digits.add(i%10);
			i = i/10;
		}
		digits.add(i);
		System.out.println(digits);
		return digits;
	}
	
	/*
	 * public static Long sumDigit(ArrayList<Long> list) {
	 * 
	 * }
	 */

}
