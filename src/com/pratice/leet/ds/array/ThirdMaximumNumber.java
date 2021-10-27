/**
 * 
 */
package com.pratice.leet.ds.array;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/
 * 
 * Given an integer array nums, return the third distinct maximum number in this
 * array. If the third maximum does not exist, return the maximum number.
 *
 * Input: nums = [3,2,1] Output: 1 Explanation: The first distinct maximum is 3.
 * The second distinct maximum is 2. The third distinct maximum is 1.
 * 
 * Example 3:
 * 
 * Input: nums = [2,2,3,1] Output: 1 Explanation: The first distinct maximum is
 * 3. The second distinct maximum is 2 (both 2's are counted together since they
 * have the same value). The third distinct maximum is 1.
 */
public class ThirdMaximumNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] arr = { 1,-2147483648};
		//int[] arr = {3,2,1};
		int[] arr = {4,2,2,3,1};
		System.out.println(ThirdMaximumNumber.thirdMax(arr));

	}

	public static int thirdMax(int[] nums) {		
		Integer first =  nums[0];
		Integer second = null;
		Integer third = null;		
		for(int i = 1;i<nums.length;i++) {		
			//System.out.println(nums[i]+", "+first +" "+second+" "+third);
			if(nums[i]== first || (second!=null && second==nums[i])
					|| (third!=null && third==nums[i])) {
				continue;
			}
			if(nums[i]>first) {
				third = second;
				second = first;
				first = nums[i];
			} else if(second == null || (nums[i] > second && nums[i] < first)) {
				third = second;
				second = nums[i];
			} else if((second != null && null == third && first!=nums[i])||(nums[i]> third && nums[i] <second)) {
				third = nums[i];
			}			
		}

		if(third != null) {
			return third;
		}
		return first;
	}

}
