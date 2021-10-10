package com.pratice.leet.ds.array;

public class DeleteElement {
	/*
	 * https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
	 * 
	 * Input: nums = [0,1,2,2,3,0,4,2], val = 2 
	 * Output: 5, nums = [0,1,4,0,3,_,_,_]
	 * Explanation: Your function should return k = 5, with the first five elements
	 * of nums containing 0, 0, 1, 3, and 4. Note that the five elements can be
	 * returned in any order. It does not matter what you leave beyond the returned
	 * k (hence they are underscores).
	 */
	public static void main(String[] args) {
		//int[] nums = {0,1,2,2,3,0,4,2};
		//int[] nums = {1};
		int[] nums = {4,5};
		int val = 5 ;
		int k = DeleteElement.removeValue2(nums, val);
		System.out.println(k);
		for(int i=0;i<k;i++) {
			System.out.print( " "+nums[i]);
		}
		
		
	}
	
	public static int removeValue2(int[] nums, int val) {
        int s = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[s] = nums[i];
                s++;
            }
        }
        return s--;
		
	}
	
	
	
	public static int removeValue(int[] nums, int val ) {
		int i=0;
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int j = nums.length-1;		
		if(nums.length==1 && nums[0]== val) {
			return 0;
		}
		while(i < j) {
			if(nums[i]==val && nums[j]!=val) {
				nums[i] = nums[j];
				nums[j] = val;
				j--;
				i++;
			} else if(nums[i]==val && nums[j]==val) {
				j--;
			} else {
				i++;
			}						
		}		
		if(nums[0]== val) {
			return 0;
		}
		if(i==j && nums[i]== val) {
			j--;
		}
		return j+1;
	}

}
