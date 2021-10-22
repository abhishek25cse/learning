package com.pratice.leet.ds.array;

import java.util.Arrays;

/*  Thois should be a in place operation
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
*
*
*/
public class ReplaceElementswithGreatestElementonRightSide {

	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		ReplaceElementswithGreatestElementonRightSide.replaceElements(arr);
		Arrays.stream(arr).forEach( x -> System.out.print(", "+x));
		
	}

	public static  int[] replaceElements(int[] arr) {
		int len = arr.length;		
		int max = -1;
		for (int i = len-1 ; i>=0 ;i--) {		
				int temp = arr[i];
				arr[i] = max;
				if(temp>max) {
					max=temp;
				}
		}
		return arr;

	}

}
