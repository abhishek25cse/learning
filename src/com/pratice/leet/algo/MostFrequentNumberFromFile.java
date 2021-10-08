package com.pratice.leet.algo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class MostFrequentNumberFromFile {
	/* From the file find the most frequent number 
	 * Think about ways to improve the performance
	 * */
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Abhishek\\Code\\learning\\src\\com\\pratice\\leet\\algo\\dataset.TXT");    
        BufferedReader br = new BufferedReader(file);
        String line = null;
        TreeMap<Integer, Integer> nmbrCount = new TreeMap<Integer, Integer>();
        while(null != (line = br.readLine())) {
        	String[] numbers = line.split(" ");
//        	System.out.println("Element = "+nmbrCount);
        	for(String s: numbers) {
        		if(nmbrCount.containsKey(Integer.valueOf(s))) {
        			nmbrCount.put(Integer.valueOf(s), nmbrCount.get(Integer.valueOf(s))+1);
        		} else {
        			nmbrCount.put(Integer.valueOf(s),1);
        		}
        	}
        	
        }
		System.out.println("Element = "+nmbrCount);

	}
	
	

}
