package com.test;

import java.util.ArrayList;

public class Quadruplet {
	/*
	 * Given a non distinct integer array, and target sum. Find the quadraplets of
	 * an array whis equal to target sum. Retunr multidimensional array of
	 * quadraplets. Input - [7, 6, 4, -1, 1, 2] target sum - 16 Result -
	 * [[7,6,4,-1], [7,6,1,2]]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {7, 6, 4, 2, 1, -1};
		
		Quadruplet.findQuad(input, 16);

	}

	
	public static int[][] findQuad(int[] input, int target) {
		int[][] output = new int[input.length][4];
		ArrayList<Numbers> quad = new ArrayList<Numbers>();
		/*
		 * HashMap<Integer,Integer> num = new HashMap<Integer,Integer>(); for(int i :
		 * input ) { num.put(i, -111); }
		 */
		
		for (int i = 0 ; i<= input.length-4;i++) {
			for(int j = i+1; j<= input.length-3;j++) {
				for (int k = j+1 ; k<= input.length-2;k++) {
					for(int l = k+1; l<= input.length-1;l++) {
						if((input[i] +input[j] +input[k]+input[l])==target) {
							Numbers n = new Numbers();
							n.n1 = input[i];
							n.n2 = input[j];
							n.n3 = input[k];
							n.n4 = input[l];
							quad.add(n);
						}
						
					}
			}
		}
		
			
		}
		
		System.out.println(quad.toString());
		return output;
		
	}
	
}
	


class Numbers {
	public int n1;
	public int n2;
	public int n3;
	public int n4;
	@Override
	public String toString() {
		return "Numbers [n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + "]";
	}
	
}
