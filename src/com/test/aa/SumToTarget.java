package com.test.aa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class SumToTarget {
	/*
	 * {3,5,6,2,9}
	 *  15
		{6,9} 
		{}
	 */


	public static void main(String[] args) {
		//int[] input = {3,5,6,2,9};
		int[] input = {3,5,5,2,9};
		int target = 6;
		
		 int[] output = SumToTarget.findSumToTarget(input,target);
		 for(int i : output) {
			 System.out.println(i);
		 }
		// TODO Auto-generated method stub

	}
	
	
	public static int[] findSumToTarget(int[] inpArray, int targetSum) {
		int size = inpArray.length;
		int[] outputArray = new int[size];
		HashMap<Integer, Integer> nmbrCount = new HashMap<Integer,Integer>();
		for(int n : inpArray) {
			if(nmbrCount.containsKey(n)) {
				nmbrCount.put(n,nmbrCount.get(n)+1);
			} else {
				nmbrCount.put(n,1);
			}
		}
		
		//Arrays.stream(inpArray).collect(Collectors.toMap(k, valueMapper))
		int indx =0;
		for(int n : inpArray) {
			int diff = targetSum-n;		
			nmbrCount.put(n, nmbrCount.get(n)-1);
			if(nmbrCount.containsKey(diff) && nmbrCount.get(diff) > 0 && nmbrCount.get(n) > 0 ) {
				nmbrCount.put(diff, nmbrCount.get(diff)-1);				
				outputArray[indx] = n;
				outputArray[++indx] = diff;
			}
		}		
		return outputArray;
		
	}
	
	

}
