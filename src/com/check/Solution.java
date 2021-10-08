package com.check;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*String 
all combination
		ABC 
		ACB, ..   6
		*/
/*ABC
ACB
BAC
BCA
CAB
CBA

abb
bca
cab*/
public class Solution {

	public static void main(String[] args) {
		Solution.combination("ABC");
	}
	
	public static void combination(String a) {
		int len = a.length();
		char[] a1 = a.toCharArray();		
		Map<Integer, String> combi = new HashMap<Integer,String>();
		for(int i=0;i<a1.length;i++) {
			combi.put(i, String.valueOf(a1[i]));			
			combiOne(i+1 , combi,  len,a1,i);			
		}
		System.out.println(combi);		
	}
	
	public static void combiOne(int j , Map<Integer, String>  combi, int len,char[] a1, int index) {
		for(int i=j;i<len;i++) {			
			combi.put(index, combi.get(index)+String.valueOf(a1[i]));			
			if(i<(len-1)) {
				combiOne(i+1 , combi,  len,a1,index);
				return;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	

}
