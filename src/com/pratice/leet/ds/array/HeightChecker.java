package com.pratice.leet.ds.array;

import java.util.Arrays;

/*

https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/
A school is trying to take an annual photo of all the students. The students are asked to stand
in a single file line in non-decreasing order by height. Let this ordering be represented by the
integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in.
Each heights[i] is the height of the ith student in line (0-indexed).
*/
public class HeightChecker {

	public static void main(String[] args) {
		//int[] heights = {1,1,4,2,1,3};
		int[] heights= {5,1,2,3,4};
		System.out.println(heightChecker(heights));

	}
	
	public static int heightChecker(int[] heights) {
        int cnt =0;
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++) {
        	if(copy[i]!= heights[i]) {
        		cnt++;
        	}
        }
        return cnt;
    }

}
