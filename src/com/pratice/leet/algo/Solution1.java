package com.pratice.leet.algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/
		
public class Solution1 {
	
	public static void main(String[] a) {
		int[] res = Solution1.solution1(new int[] {2,7,11,15}, 9);
		Arrays.asList(res).stream().forEach(i -> {
			System.out.println(" ++++  "+i);
		});
	}
	
	
	public static int[] solution1(int[] nums , int target ) {
		HashMap<Integer, Integer> itemMap = new HashMap<Integer, Integer>();
		int differnce = 0;
		

		for(int i = 0 ; i <nums.length; i++) {
			differnce = target - nums[i];
			if(itemMap.containsKey(differnce)) {
				return new int[] {itemMap.get(differnce), i};
			}
			itemMap.put(nums[i],i);			
		}			
		return null;	
	}

}
