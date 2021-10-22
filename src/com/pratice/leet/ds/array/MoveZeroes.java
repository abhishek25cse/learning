package com.pratice.leet.ds.array;

import java.util.Arrays;

/*https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*/
public class MoveZeroes{

	public static void main(String[] args) {
		//int[] arr = {0,1,0,3,12};
		int[] arr = {0,0,0,1,0,0};
		MoveZeroes.moveZeroes(arr);
		Arrays.stream(arr).forEach(x -> System.out.print(", "+x));

	}
	
	public static void moveZeroes(int[] nums) {		
		int write =0;
        int len = nums.length;
        
        int read =0;
		while(read<len) {
			if(nums[read] != 0) {
				swap(read,write,nums);
				write++;
			}
			read++;
		}        
    }
	public static void swap(int read, int write, int[] nums) {
		int temp = nums[read];
		nums[read] = 0;
		nums[write] = temp;
	}

}
