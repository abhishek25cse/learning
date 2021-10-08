package com.check.fresh;

import java.util.ArrayList;
import java.util.Collections;

/*
WAP to find a pair whose sum is closest to zero
It can be negative or positive. 
*/
public class SumClosestToZero {

	public static void main(String[] args) {
		//int[] input = new int[] { 12, 30, 67, 0, -11, -28, 5, 7, 100 };
		int[] input = new int[] {1,2,3,4,5} ;
		//int[] input = new int[] {-8,1,4,5} ;
		//int[] input = new int[] {-1, 1, -2, 2};
		//int[] input = new int[] {-8,7,1,4,5 };
		System.out.println(findSum(input));
		

	}

	public static int findSum(int[] arys) {
		int sum = 9999;
		if (null == arys || arys.length == 0) {
			return 9999;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : arys) {
			list.add(i);
		}

		Collections.sort(list);
		int len = list.size();
		System.out.println("Sorted " + list);
		int n1 = 9999;
		int n2 = 0;

		for (int i = 0; i < len - 1; i++) {
			Integer temp1 = list.get(i);
			Integer temp2 = 9999;
			if(temp1 < 0 ) {
				int j= len-1;
				while (j>i) {
					temp2 = temp1+list.get(j);
					temp2 = Math.abs(temp2);
					if(temp2 < sum) {
						sum = temp2;
					}
					j--;
				}
			} else {
				int j= i+1;				
				while (j<len) {
					temp2 = temp1+list.get(j);
					temp2 = Math.abs(temp2);
					if(temp2 < sum) {
						sum = temp2;
					}
					j++;
				}
				
			}
			
			/*
			 * for (int j = i + 1; j < len; j++) { int temp = 0 - (list.get(i) +
			 * list.get(j));
			 * 
			 * if ( temp < sum) { sum = temp; n1 = list.get(i); n2 = list.get(j); } }
			 */
		}
		return sum;
	}

}
