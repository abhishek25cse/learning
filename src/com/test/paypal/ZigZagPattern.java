package com.test.paypal;

import java.util.ArrayList;

//  DOne : Asked in paypal interview on 23-Sept-2021
public class ZigZagPattern {
	/*
	 * https://leetcode.com/problems/zigzag-conversion/solution/
	 * 
	 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
			
		P   A   H   N
		A P L S I I G
		Y   I   R
		And then read line by line: "PAHNAPLSIIGYIR"
		
		Write the code that will take a string and make this conversion given a number of rows:
		
		string convert(string s, int numRows);							
	 */

	public static void main(String[] args) {
		System.out.println(ZigZagPattern.convert("PAYPALISHIRING", 3));
	}

	public static String convert(String s, int numRows) {
		ArrayList<StringBuffer> theList = new ArrayList<StringBuffer>();
		for (int i = 0; i < numRows; i++) {
			theList.add(new StringBuffer());
		}
		StringBuffer sOut = new StringBuffer();
		int zigzagCnt = numRows - 2;
		int eleWithZigzag = numRows + zigzagCnt;
		char[] sChar = s.toCharArray();
		for (int i = 0; i < sChar.length; i++) {
			int row = i % eleWithZigzag;
			Boolean isZigZag = row > (numRows - 1) ? Boolean.TRUE : Boolean.FALSE;
			if (isZigZag) {
				row = (2 * numRows) - row - 2;
			}
			theList.get(row).append(sChar[i]);
		}
		for (StringBuffer sb : theList) {
			sOut.append(sb);
		}
		return sOut.toString();
	}

}
