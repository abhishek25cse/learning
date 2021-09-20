package com.test.socgen;

import java.util.ArrayList;

public class FindSecondLargest {

	public static void main(String[] args) {		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(7);
		
		int max =list.get(0);
		int min =list.get(1);
		
		for(int i : list) {
			if(i>max) {
				min = max;
				max= i;
			} else if(i>min) {
				min = i;
			}
		}
		System.out.println("second largest "+min);
		
		
		// TODO Auto-generated method stub

	}
	
	/*
	 * 
	 * i = 1,2, 4 , 3 , 7
	 *  max = 1, 2 , 4 , 7
	 *  min = 2 ,1 , 2 , 3 , 4
	 */
	
	

}
