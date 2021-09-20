package com.mantra;

import java.util.HashSet;

/*
Example 1:
	Input: [1,2,0]
	Output: 3
	Example 2:
	Input: [3,4,-1,1]
	Output: 2
	Example 3:
	Input: [7,8,9,11,12]
	Output: 1
*/
public class SmallestPositivesmissing {	
	
	public static void main(String[] a) {
		int[] input1 = new int[] {1,2,0};
		int[] input2 = new int[] {3,4,-1,1};
		int[] input3 = new int[] {7,8,9,11,12};
		int[] input4 = new int[] {0 };
		int[] input5 = null;
		
		System.out.println("Smallest Missing "+SmallestPositivesmissing.findMissing(input5));
		
	}
	
	public static Integer findMissing(int[] inputArray) {
		if(inputArray == null) {
			return null;
		}		
		HashSet<Integer> numberSet =  new HashSet<Integer>();
		Integer missingNum = 0;
		for(int i : inputArray) {
			numberSet.add(i);			
		}
		int k = 0;
		for(int i=0;i<numberSet.size(); i++) {
			if(!numberSet.contains(i+1)) {
				k = i+1;
				break;
			}
		}
		
		if(k==0 ) {
			return numberSet.size();
		}else {
			return k;
		}
		
		
	}
	
	
	

}
/*
 * 
 * // Rough
 * 
 * 1,2,0 -->
 * 
 * sort input --> 0,1,2 expected -- > 1,2,3 1 2 3? --> o/p
 * 
 * ------ 3,4,-1,1 sort -> -1,1,3,4 expected --> 1,2,3,4 1 2? o/p
 * 
 * ============ 3,2,-1,1 HashSet as[3,2,-1,1] for( i -> set.lenth) {
 * if(haset.add(i) ) { break; } }
 */ 