/**
 * 
 */
package com.pratice.leet.ds.array;

import java.util.Arrays;

/**
 * @author abhis
 * 
 *         https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
 *         Given an integer array nums, move all the even integers at the
 *         beginning of the array followed by all the odd integers.
 * 
 *         Return any array that satisfies this condition. Example 1:
 * 
 *         Input: nums = [3,1,2,4] Output: [2,4,3,1] Explanation: The outputs
 *         [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 * 
 */
public class SortArrayByParity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 3, 1};
		nums = sortArrayByParity(nums);
		Arrays.stream(nums).forEach(x -> System.out.print(" " + x));

	}

	public static int[] sortArrayByParity(int[] nums) {
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
		return nums;

	}

}
