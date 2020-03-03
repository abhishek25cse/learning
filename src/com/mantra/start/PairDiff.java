package com.mantra.start;

import java.util.HashSet;
import java.util.Iterator;

public class PairDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,7,2,4};
		
		//int[][] abg = {(1,9),(3,1),(5,7),(2,4)};
		int[][] am = {{1,2},{2,3}};
		//int[][] de = {1,0,2};
				
	//	findPairs(a,a.length);
		
		HashSet<Integer> nmbrMap = new HashSet<>();
		nmbrMap.add(1);
		nmbrMap.add(3);
		nmbrMap.add(5);
		nmbrMap.add(7);
		nmbrMap.add(2);
		
		
	/*	Iterator<Integer> it = nmbrMap.keySet().iterator();
		
		while(it.hasNext()) {
			int ele = it.next();
			if(nmbrMap.containsKey(ele+2)) {
				System.out.println("pair : "+ele + " -- "+(ele+2));	
			}
				
				
		}*/
		
		 
		
	}
	// sort == 1,2,3,4,5,7
	
	

public static void findPairs(int[] a, int len) {

for(int i=0; i<len-1;i++) {
	for (int j=i+1;j<len;j++) {
		if(a[j]-a[i] == 2 ){
		System.out.println("pair : "+a[i] + " -- "+a[j]);	
		}
	}
}

}



}
// {1,3},{5,7},{3,5},{2,4}
// O(n2)
