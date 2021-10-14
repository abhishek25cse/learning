package com.pratice.leet.ds.array;

/*
 * https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
Given an array of integers arr, return true if and only if it is a valid mountain array.
Input: arr = [2,1]
Output: false
				
Input: arr = [3,5,5]
Output: false
						
Input: arr = [0,3,2,1]
Output: true
*/

public class ValidMountainArray {

	public static void main(String[] args) {
		//int[] arr = {0,3,2,1};
		//int[] arr = {3,5,5};
		//int[] arr = {2,1};
		int[] arr = {0,1,2,1,2};
		//int[] arr = {0,1,3,4,5};
		//int[] arr = {4,3,2,1,0};
		System.out.println(" "+ValidMountainArray.validMountainArray(arr));
		System.out.println(" "+ValidMountainArray.validMountainArrayCheck(arr));

	}
	
	public static boolean validMountainArrayCheck(int[] arr) {
		if(null == arr || arr.length <3)  return false;		
		boolean increase = true;
		int prev = arr[0];
		if(prev > arr[1]) return false;
		for (int i=1;i<arr.length;i++) {	
			if(prev == arr[i]) return false;
			if(increase) {
				if(prev > arr[i]) {
					increase = false;
				} 
			} else {
				if(prev<arr[i]) {
					return false;
				}
			}
			prev = arr[i];
		}		
		return !increase;
	}


	public static boolean validMountainArray(int[] arr) {
		if(null == arr || arr.length <3)  return false;
		
		int cnt1 = 0;
		boolean increase = false;
		boolean decrease = false;
		int prev = arr[0];
		for (int i=1;i<arr.length;i++) {
			if(prev<arr[i] && increase ==false && decrease == false ) {
				cnt1++;
				prev = arr[i];
				increase = true;
			} else if(prev<arr[i] && increase == true && decrease == false ) {
				prev = arr[i];
			}
			else if(prev > arr[i] && decrease == false && increase == true) {
				cnt1++;
				prev = arr[i];
				decrease = true;
			} else if(prev > arr[i] && decrease == true && increase == true) { 
				prev = arr[i];
			} else {
				return false;
			}
		}
		/*
		 * System.out.println(increase); System.out.println(decrease);
		 * System.out.println(cnt1);
		 */
		if(true == increase && true == decrease && cnt1==2) {
			return true;
		} else {
			return false;
		}
	}

}
