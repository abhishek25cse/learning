package com.mantra.misc;


/*given a sequence of char  , split it into half and add fisrt to last and remove the common character,
asdfgasdfa == */
public class SplitAndUnite {

	public static void main(String[] args) {
		String testString = "aaaagqaaaaa";
		
		String s1 = testString.substring(0, testString.length()/2 );
		String s2 = testString.substring(testString.length()/2 , testString.length());
		System.out.println(s1 +"  "+s2);
		System.out.println(s1.charAt(0) +"  "+s2.charAt(s2.length()-1) );
		
		while(s1.charAt(0) == s2.charAt(s2.length()-1) ) {
			char c = s1.charAt(0);
			while (c == s1.charAt(0)) {
				s1 = s1.substring(1, s1.length());
			}
			while (c == s2.charAt(s2.length()-1)) {
				s2 = s2.substring(0,s2.length()-1);
			}			
		}
				
		System.out.println(s1 +"  "+s2 + " "+(s1+s2).length());

	}

}
