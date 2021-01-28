package com.test;

public class TestMain {

	public static void main(String[] args) {	
		
		Runnable task = ()-> {
			System.out.println("Hello World");
		};
		
		//  MyThread mT = new MyThread(); 
		  Thread t = new Thread(task);
		  t.start();
		 
		
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4,4,6};
		//TestMain.mergeArray(arr1, arr2);
		
		System.out.println(TestMain.countWord("one two    three four      "));
	}
	
	
	public static void mergeArray(int[] arr1, int[] arr2) {
		
		int len1= arr1.length;
		int len2= arr2.length;
		int[] finalArr = new  int [len1+len2];
		int i = 0;
		int j=0;
		int k=0;
		while (i < len1  && j<len2) {
			if(arr1[i] < arr2[j]) {
				finalArr[k] = arr1[i];
				i++;			
			} else {
				finalArr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		if(i<len1) {
			while(i<len1) {
				finalArr[k] = arr1[i];
				i++;
				k++;
			}
		} else {
			while(j<len2) {
				finalArr[k] = arr2[j];
				j++;
				k++;
			}			
		}	
		
		System.out.println("The final Array");
		for(int y : finalArr) {
			System.out.print(y +" , ");
		}
		
	}
	
	
	public static int countWord(String str) {
		int count = 0 ;
		char space = ' ';		
		//str =  str.trim();
		if(str.length() > 0) {
			count = count+1;
		}
		int len = str.length();		
		int numSpace = 0 ;
		
		for(int i = 0 ; i<len ; i++ ) {	
			
			if(str.charAt(i) == space) {				
				count ++;
				numSpace++;
				while (i< (len-1) && str.charAt(i+1) == space) {
					i++;
					numSpace++;
				}
			}
		}
		if (numSpace == len) {
			return 0;
		} else if(str.charAt(len-1) == space) {
			return (count -1);
		} else {
			return count;
		}
		
	}
	
	

}
