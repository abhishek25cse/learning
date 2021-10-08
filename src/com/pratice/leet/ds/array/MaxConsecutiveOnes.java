package com.pratice.leet.ds.array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1 };
		System.out.println(findMaxConsecutiveOnes(nums));

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int cnt = 0;
		int max = 0;
		for (int n : nums) {
			if (n == 1) {
				cnt++;
			} else {
				if(cnt>max) {
					max=cnt;
				}
				cnt = 0;
			}
		}
		if(cnt > max) {
			max = cnt;
		}
		return max;
	}

}
