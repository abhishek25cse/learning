package com.mantra.capture.info.hackerEarth;

public class ArrayCheck {

	public static void main(String[] args) {
		int a[] = new int[10];
		for(int i=0;i<10; ++i) {
			a[i] = i/2;
			a[i]++;
			System.out.println(a[i]);
			i++;
		}
		
		StringBuffer s = new StringBuffer();
		s.append("Added");
		System.out.println(s.toString());

	}

}
