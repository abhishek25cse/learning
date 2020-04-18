package com.mantra.practice.algo.recursion;

/*Write a recursive function that checks whether a string is a palindrome (a palindrome is
a string that's the same when reads forwards and backwards.)
*/
public class CheckPalindrome {

	public static void main(String[] args) {
		String s = "ab";
		if(s == null || s.isEmpty()) {
			System.out.println("Null / empty object");
		} else {
			System.out.println(s +" is palindrome = "+isPalindrome(s, 0, s.length()-1));
		}
	}
	

	
	public static Boolean isPalindrome(String s, int st, int en) {
		if(st>=en) {
			return true;
		}
		if(s.charAt(st) == s.charAt(en)) {
			return isPalindrome(s, st+1, en-1);
		} else {
			return false;
		}
	}

}
