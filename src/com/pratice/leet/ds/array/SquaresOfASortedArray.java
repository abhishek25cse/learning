package com.pratice.leet.ds.array;

import java.util.Arrays;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		System.out.println(sortedSquares(nums));

	}

	public static int[] sortedSquares(int[] nums) {		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) Math.pow(nums[i], 2);
		}
		Arrays.sort(nums);
		return nums;
	}

}
