package com.geeksforgeeks.array;


	class OddOccurance 
	{ 
		int getOddOccurrence(int ar[], int ar_size) 
		{ 
			int i; 
			int res = 0; 
			for (i = 0; i < ar_size; i++) 
			{ 	System.out.print(res +" XOR " +ar[i]);
				res = res ^ ar[i]; 
				System.out.println(" =  "+res );
			} 
			return res; 
		} 

		public static void main(String[] args) 
		{ 
			OddOccurance occur = new OddOccurance(); 
			int ar[] = new int[]{5,2, 2,3,3, 5, 5}; 
			int n = ar.length; 
			System.out.println(occur.getOddOccurrence(ar, n)); 
		} 
	} 



