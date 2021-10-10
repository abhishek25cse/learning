package com.pratice.leet.ds.array;

/*
https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 representing the number of elements in nums1 and nums2 respectively.
*/
public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0}; 
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		//MergeSortedArray.merge(nums1, m, nums2, n);
		MergeSortedArray.merge2(nums1, m, nums2, n);
		for(int k : nums1) {
			System.out.print(" "+k);
		}
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int i=0;
		int j=0;
		int[] copy = new int[nums1.length];
		
		for (int l=0;l<nums1.length;l++) {
			copy[l]=nums1[l];
		}
		int k = 0;
		while (i<m && j<n) {
			if(nums2[j]>copy[i]) {
				nums1[k] = copy[i];
				i++;
			} else {
				nums1[k] = nums2[j];
				j++;
			}
			k++;			
		}
		if (i>= m) {
			while (j<n) {
				nums1[k] = nums2[j];
				j++;
				k++;
			}
		} else if(j>=n) {
			while (i<m) {
				nums1[k] = copy[i];
				i++;
				k++;
			}
		}        
    }
	
	public static void merge2(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1, p2 = n-1, p = nums1.length - 1;
        while (p > -1) {
            int cand1 = p1 > -1 ? nums1[p1] : Integer.MIN_VALUE;
            int cand2 = p2 > -1 ? nums2[p2] : Integer.MIN_VALUE;
            if (cand1 > cand2) {
                nums1[p] = cand1;
                p1--;
            } else {
                nums1[p] = cand2;
                p2--;
            }
            p--;
        }
    }
		
		
	
}
