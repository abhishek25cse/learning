package com.test.oracle;

import java.util.ArrayList;
import java.util.List;

/*
Draw a zigzag pattern for a matrix*/
public class PatternInRC {
	// 1,2,3,,,,,10,
	/// 20,
	// 30,29,28,,,,,,21,
	//31,41,,,,,,50
	// number in cell = (R-1)*R+C

	public static void main(String[] a) {
		System.out.println(matrix(5, 5));

	}

	public static List<Integer> matrix(int r, int c) {
		Boolean reverse = Boolean.TRUE;
		List<Integer> list = new ArrayList<Integer>();
		int j = 1;
		int value = 0;
		for (int i = 1; i <= r; i++) {
			if (i % 2 == 0) {
				if(reverse) {
					j=1;
				}else {
					j = c;
				}
				
				value = ((i - 1) * r) + j;
				list.add(value);
			} else {
				reverse = !reverse;
				while (j > 0 && j <= c) {
					if (i == 1) {
						value = j;
					} else {
						value = ((i - 1) * r) + j;
					}
					list.add(value);
					if (reverse) {
						j--;
					} else {
						j++;
					}

				}
			}
		}

		return list;
	}

}
