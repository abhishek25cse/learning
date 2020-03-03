package com.mantra.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Solution2 {

	public static void main(String[] args) {
	int[] A = new int[8];
				A[0] = 0;
			  A[1] = 3;
			  A[2] = 3;
			  A[3] = 7;
			  A[4] = 5;
			  A[5] = 3;
			  A[6] = 11;
			  A[7] = 1;
			System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int retrn = -2;		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedHashMap<Integer, Integer> maps = new LinkedHashMap<>();
		
		int cnt = 0;
		for (int i : A) {
			arrayList.add(i);
			if(maps.containsKey(i)) {
				maps.put(i,cnt);
				return 0;
			}
			 cnt++;
				
			
		}
		Collections.sort(arrayList);
		ArrayList<Integer> adj = new ArrayList<Integer>();
		int diff =0;
		int min =100000000;
		for(int i=1;i<arrayList.size();i++) {
			 diff = arrayList.get(i) - arrayList.get(i-1);
			 if(min>diff) {
				 min =diff;
				 retrn=diff;
			 }
		}
if(retrn>100000000) {
	return -1;
}
		return retrn;
	}

}
