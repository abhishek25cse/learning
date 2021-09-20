package com.mantra;

import java.util.Arrays;

public class PatternMatching {
	/*
	 * s ="aa" p = a == false * p = a* = true p = a? = true
	 * 
	 * 
	 * s = "adceb" p = "*a*b" = true
	 * 
	 * exact match ? == any 1 char any set of char
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(PatternMatching.checkMatchOPattern("adceb", "*a*z"));

	}

	public static Boolean checkMatchOPattern(String s, String pattern) {
		Boolean isMatch = Boolean.TRUE;
		String[] splitStr = pattern.split("\\*");
		Arrays.asList(splitStr).stream().forEach(str -> System.out.println(str));
		
		
		
				
				
				
				
				
				
				
		
		
		
		/*
		 * Boolean isMatch = Boolean.TRUE; if(!pattern.contains("*") && s.length()!=
		 * pattern.length()) { return isMatch; } int j=0; for(int i=0 ; i< s.length(); }
		 * i++) { if(pattern.charAt(j) == '?') { j++; } else if(pattern.charAt(j) ==
		 * '*') { if(j == (pattern.length()-1)) { return Boolean.TRUE; } else { //
		 * System.out.println("TODO"); while(i < (s.length()-1) && pattern.charAt(j+1)
		 * != s.charAt(i+1) ) { i++; } j++; // }
		 * 
		 * } else if(s.charAt(i) == pattern.charAt(j)){ j++; }else { return
		 * Boolean.FALSE; }
		 * 
		 * 
		 * }
		 */
		  
		 return isMatch;
		
	}

}
// Rough
/*
 * 
 * if !p contains "*" then lengh pattern and lenth of string should be same
 * 
 * 1. keep maching the charactefr until any special char is encountered
 * 
 * 2.
 */
