package com.mantra.capture.info.hackerEarth;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheBiggerTheGreater {

	// Complete the biggerIsGreater function below.
	static String biggerIsGreater(String w) {
		char[] nmbrs = w.toCharArray();
		Boolean found = nextPermutation(nmbrs);
		if(found) {
			StringBuilder finalStr = new StringBuilder();
			for (char c : nmbrs) {
				finalStr.append(c);
			}
			return finalStr.toString();
		} else {
			return "no answer";
		}
		/*int len = nmbrs.length;
		for (int i = (len - 1); i > 0; i--) {
			if (nmbrs[i] > nmbrs[i - 1]) {
				// sort(nmbrs, i );
				biggerIsGreaterHelper(nmbrs, i);
				break;
			}
		}

		StringBuilder finalStr = new StringBuilder();
		for (char c : nmbrs) {
			finalStr.append(c);
		}
		if (finalStr.toString().equals(w)) {
			return "no answer";
		} else {
			return finalStr.toString();
		}*/

	}

	static char[] biggerIsGreaterHelper(char[] nmbrs, int i) {

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
		return nmbrs;

	}
	
	public static boolean nextPermutation(char[] array) {
	    // Find longest non-increasing suffix
	    int i = array.length - 1;
	    while (i > 0 && array[i - 1] >= array[i])
	        i--;
	    // Now i is the head index of the suffix
	    
	    // Are we at the last permutation already?
	    if (i <= 0)
	        return false;
	    
	    // Let array[i - 1] be the pivot
	    // Find rightmost element that exceeds the pivot
	    int j = array.length - 1;
	    while (array[j] <= array[i - 1])
	        j--;
	    // Now the value array[j] will become the new pivot
	    // Assertion: j >= i
	    
	    // Swap the pivot with j
	    char temp = array[i - 1];
	    array[i - 1] = array[j];
	    array[j] = temp;
	    
	    // Reverse the suffix
	    j = array.length - 1;
	    while (i < j) {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        i++;
	        j--;
	    }
	    
	    // Successfully computed the next permutation
	    return true;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	

		int T = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		System.out.println("\n");
		for (int TItr = 0; TItr < T; TItr++) {
			String w = scanner.nextLine();

			String result = biggerIsGreater(w);
			System.out.println(result);
		}


		scanner.close();
	}
}

