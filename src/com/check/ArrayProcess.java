package com.check;

import java.util.Arrays;

public class ArrayProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * sqURE >12000 AVG
		 */
		int[] nums = {100,24,13,44,114,200,40,112};
		//Arrays.stream(nums).filter(i-> i%2==0).
		Arrays.stream(nums).map(i-> i*i).
		filter(e -> (e>12000)).average();
		
	}

}
