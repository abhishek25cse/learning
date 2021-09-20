package com.test.aa.Sept;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(String[] A) {
    	if(null == A || A.length== 0) {
    		return 0;
    	}
    	 HashSet<Character> charAdded = new HashSet<Character>();    	 
    	 for(String a : A) {
    		// System.out.println(charAdded +" HashSet");
    		//System.out.println(a +" The Sring opertation  "+this.findCommonChar(a, charAdded));
    		 this.findCommonChar(a, charAdded)
    	 }
    	 return charAdded.size();
    }
    
    private Boolean findCommonChar(String a, HashSet<Character> charAdded) {
    	char[] aCh = a.toCharArray();
    	HashSet<Character> chars =  new HashSet<Character>();
    	for(char c : aCh) {
    		if((!chars.add(c)) || charAdded.contains(c) ) {
    			return Boolean.FALSE;
    		}
    	}
    	for(char c : aCh) {
    		charAdded.add(c);
    	}
    	return Boolean.TRUE;
    }
    
    
    public static void main(String[] a) {
    	Solution sol = new Solution();
    	//String[] A = new String[]{"co","dil","ity"};
    	String[] A = new String[]{"abc","yyy","def","csv"};
    	System.out.println(sol.solution(A));
    	
    }
}
