package com.mantra.misc;

// For a given number find the next greater number which can be formed by combination of the given digits.
public class FindNextGreatestNumber {
	
	public static void main (String[] a) {
		//int number = 32751;		
		//int[] nmbrs = {3,2,7,5,1};		
		//int[] nmbrs = {1,2,3};	
		//int[] nmbrs = {3,2,5,7,1};	
		char[] nmbrs = {'l','m','n','o'};
		String s = "asdasd";
		char[] nw = s.toCharArray();
		System.out.println("------"+nw.toString());
		int len = nmbrs.length;
		for(int i=(len-1);i>0;i--) {			
			if(nmbrs[i] > nmbrs[i-1]) {					
				//sort(nmbrs, i );	
				sortCh(nmbrs, i );	
				break;
			}
		}
		System.out.println("\n DONE");
	}
	
	public static void sort(int[] nmbrs, int i) {

		for (int l : nmbrs) {
			System.out.print(l);
		}
		System.out.println();
		int pivt = i - 1;
		int nxt = i;
		for (int j = i; j < nmbrs.length; j++) {
			if (nmbrs[j] > nmbrs[pivt] && nmbrs[j] < nmbrs[nxt]) {
				nxt = j;
			}
		}
		/*
		 * System.out.println(pivt); System.out.println(nxt);
		 */
		int temp = nmbrs[pivt];
		nmbrs[i - 1] = nmbrs[nxt];
		nmbrs[nxt] = temp;
		for (int j = i; j < nmbrs.length - 1; j++) {
			for (int k = i + 1; k < nmbrs.length; k++) {
				if (nmbrs[j] > nmbrs[k]) {
					temp = nmbrs[j];
					nmbrs[j] = nmbrs[k];
					nmbrs[k] = temp;
				}
			}
		}
		for (int j = 0; j < nmbrs.length; j++) {
			System.out.print(nmbrs[j]);
		}

	}
	
	public static void sortCh(char[] nmbrs, int i) {

		for (int l : nmbrs) {
			System.out.print(l);
		}
		System.out.println();
		int pivt = i - 1;
		int nxt = i;
		for (int j = i; j < nmbrs.length; j++) {
			if (nmbrs[j] > nmbrs[pivt] && nmbrs[j] < nmbrs[nxt]) {
				nxt = j;
			}
		}
		/*
		 * System.out.println(pivt); System.out.println(nxt);
		 */
		char temp = nmbrs[pivt];
		nmbrs[i - 1] = nmbrs[nxt];
		nmbrs[nxt] = temp;
		for (int j = i; j < nmbrs.length - 1; j++) {
			for (int k = i + 1; k < nmbrs.length; k++) {
				if (nmbrs[j] > nmbrs[k]) {
					temp = nmbrs[j];
					nmbrs[j] = nmbrs[k];
					nmbrs[k] = temp;
				}
			}
		}
		for (int j = 0; j < nmbrs.length; j++) {
			System.out.print(nmbrs[j]);
		}

	}

}
