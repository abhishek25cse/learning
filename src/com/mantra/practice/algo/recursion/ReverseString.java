package com.mantra.practice.algo.recursion;

/*Write a recursive function that, given a string s, prints the characters of s in reverse order.*/
public class ReverseString {

	public static void main(String[] args) {
		String s = null;
		System.out.print(reverseString(s));
	}

	public static String reverseString(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		} else {
			int len = s.length();
			return s.substring(len - 1) + reverseString(s.substring(0, len - 1));
		}
	}
}
