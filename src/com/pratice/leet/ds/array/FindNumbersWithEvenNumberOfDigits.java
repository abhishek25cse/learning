package com.pratice.leet.ds.array;

public class FindNumbersWithEvenNumberOfDigits {

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(nums));

	}

	public static int findNumbers(int[] nums) {
		int cnt =0;		
		for(int n : nums) {
			if((String.valueOf(n).length())%2 == 0) {
				cnt++;
			}
		}		
		// use system.gc() , but this will require time to execute. Hence its a trade off with tome and space
		//System.gc();
		return cnt;

	}

}
