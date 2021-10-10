package com.test.oracle;

import java.util.Arrays;

public class ArrayProcess {
// try java 8 feature to find square , filter , avg of the array
	public static void main(String[] args) {
				int[] nums = {100,24,13,44,114,200,40,112};
		//Arrays.stream(nums).filter(i-> i%2==0).
		System.out.println(Arrays.stream(nums).map(i-> i*i).
		filter(e -> (e>12000)).average());
		
	}

}
