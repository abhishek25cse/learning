package com.pratice.leet.ds.array;

import java.util.Arrays;
import java.util.HashSet;

/*
 * https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
	
	Input: nums = [0,0,1,1,1,2,2,3,3,4]
	Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
	Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
	It does not matter what you leave beyond the returned k (hence they are underscores).
	*/
public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(RemoveDuplicatesfromSortedArray.removeDuplicates(nums));

	}
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length == 0) return 0;
		int j=0;
		for (int i=1; i<nums.length;i++) {			
			if(nums[j] != nums[i]) {
				j++;
				nums[j] = nums[i];
			}
		}
		return j;
		
		
	}
	
	
	public static int removeDuplicates1(int[] nums) {
		if(null == nums || nums.length==0) {
			return 0;
		}
		// Using collection is memory wise heavy operation and also performacne wise heavy.
		HashSet<Integer> numbers = new HashSet<Integer>();
		int dub =0;
		int len = nums.length;
		int max = nums[len-1]+10;
		for (int i =0;i< nums.length;i++) {
			if(!numbers.add(nums[i])) {
				dub++;
				nums[i] =  max;
			}
		}
		Arrays.sort(nums);
		return len-dub;
	}

}
