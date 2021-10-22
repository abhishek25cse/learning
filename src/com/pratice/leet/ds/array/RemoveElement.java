package com.pratice.leet.ds.array;

import java.util.Arrays;

/*
 * this is not done
https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3575/
	Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
	The relative order of the elements may be changed.
	Example 1:

		Input: nums = [3,2,2,3], val = 3
		Output: 2, nums = [2,2,_,_]
		Explanation: Your function should return k = 2, with the first two elements of nums being 2.
		It does not matter what you leave beyond the returned k (hence they are underscores).*/
public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 3, 1};
		removeElement(nums,3);
		Arrays.stream(nums).forEach(x -> System.out.print(" " + x));

	}

	public static void removeElement(int[] nums, int val) {
		int temp = 0;
		int len = nums.length;
		int read = 0;
		int write = 0;
		while (read < len) {
			if (nums[read] % 2 == 0) {
				temp = nums[write];
				nums[write] = nums[read];
				nums[read] = temp;
				write++;
			}
			read++;
		}
		//return nums;

	}

}
