package com.test;

import java.util.ArrayList;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

/*
					Find the second max number in one iteration
					*/
public class SecondMaxNumber {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(21);
		list.add(31);
		list.add(41);
		list.add(51);
		list.add(61);
		list.add(71);
		list.add(7);
		
		int max = list.get(0);
		int max2 =  list.get(1);
		for(Integer i : list) {
			if(i> max) {
				max2 = max;
				max = i;
				
			} else if(i>max2 && max!=i){
				max2 = i;
			} /*
				 * else { max2 = i; }
				 */
		}
		
		System.out.println(max2);
		//System.out.println(max);
		

	}

}
