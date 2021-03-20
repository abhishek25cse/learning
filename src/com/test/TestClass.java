package com.test;

import java.util.Scanner;
import java.lang.String;

public class TestClass {
//Be not afraid of greatness

	
	  public static void main(String[] args) throws Exception { Scanner s = new
	  Scanner(System.in); String sentence = s.nextLine();
	  System.out.println(findLongestEvenWord(sentence)); }
	 

	public static String findLongestEvenWord(String sentence) {
		if (sentence == null) {
			return null;
		}
		String longestEvenString = null;
		char[] sentenceCh = sentence.toCharArray();
		int lenSn = sentenceCh.length;
		int lenLong = 0;
		String longestEvenStringOld = null;
		for (int i = 0; i < lenSn; i++) {
			if (sentenceCh[i] != ' ') {
				lenLong++;
				if (null == longestEvenString) {
					longestEvenString = String.valueOf(sentenceCh[i]);
				} else {
					longestEvenString = longestEvenString + sentenceCh[i];
				}
				while(i<lenSn && sentenceCh[i+1] == ' ') {
					i++;
				}
			} else {
				int lenCurr = longestEvenString.length();
				if ((longestEvenStringOld == null && lenCurr % 2 == 0)
						|| (lenCurr % 2 == 0 && lenCurr > longestEvenStringOld.length())) {
					longestEvenStringOld = longestEvenString;
				}
				longestEvenString = null;
			}
		}
		int lenCurr = longestEvenString.length();
		if ((longestEvenStringOld == null && lenCurr % 2 == 0)
				|| (lenCurr % 2 == 0 && lenCurr > longestEvenStringOld.length())) {
			longestEvenStringOld = longestEvenString;
		}

		return longestEvenStringOld;

	}

	/*
	 * public static void main(String args[] ) throws Exception { Sample code to
	 * perform I/O: Use either of these methods for input
	 * 
	 * //BufferedReader BufferedReader br = new BufferedReader(new
	 * InputStreamReader(System.in)); String name = br.readLine(); // Reading input
	 * from STDIN System.out.println("Hi, " + name + "."); // Writing output to
	 * STDOUT
	 * 
	 * //Scanner Scanner s = new Scanner(System.in); String name = s.nextLine(); //
	 * Reading input from STDIN //System.out.println("Hi, " + name + "."); //
	 * Writing output to STDOUT String[] input = name.split(" "); int[] inp = new
	 * int[input.length]; int i=0; for(String sI : input) { inp[i] =
	 * Integer.parseInt(sI); i++; }
	 * 
	 * TestClass.maxProfit(inp); // Write your code here
	 * 
	 * }
	 */

	public static int maxProfit(int[] prices) {
		if (null == prices) {
			return 0;
		}
		if (prices.length == 1) {
			return prices[0];
		}
		int currMax = 0;
		int max = 0;
		int len = prices.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				currMax = prices[j] - prices[i];
				if (currMax > max) {
					max = currMax;
				}
			}

		}
		return max;

	}
}
