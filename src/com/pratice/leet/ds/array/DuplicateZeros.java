package com.pratice.leet.ds.array;

/*
https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
*/
public class DuplicateZeros {

	public static void main(String[] args) {
		int[] nums = {1,0,2,3,0,4,5,0};
		duplicateZeros(nums);
		for(int i : nums) {
			System.out.println(i);
		}

	}
	
public static void duplicateZeros(int[] arr) {
		int[] arr1 = new int[arr.length];
		for( int i=0;i<arr.length;i++) {
			arr1[i] = arr[i];
		}
		int j=0;
        for(int i = 0 ; i<arr.length && j< arr.length;i++) {
        	arr[j] = arr1[i];        	
        	if(arr1[i] == 0 && j!=(arr.length-1)) {
        		j++;
        		arr[j] = arr1[i];        		
        	}
        	j++;
        }
        
    }

}
