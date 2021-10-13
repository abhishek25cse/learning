package com.pratice.leet.ds.array;

/*
 * https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
	Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

	More formally check if there exists two indices i and j such that :

	i != j
	0 <= i, j < arr.length
	arr[i] == 2 * arr[j]*/
public class CheckIfNandItsDoubleExist {

	public static void main(String[] args) {
		//int[] arr = {7,1,14,11};
		int[] arr = {-2,0,10,-19,4,6,-8};
		System.out.println(CheckIfNandItsDoubleExist.checkIfExist(arr));
		
	}

	public static boolean checkIfExist(int[] arr) {
		boolean isPresent = false;
		if(null == arr || arr.length==0) {
			return false;
		}
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if((arr[i]*2 == arr[j]) || (arr[j]*2 == arr[i])) {
					return true;
				}
			}
		}		
		return isPresent;

	}

}
