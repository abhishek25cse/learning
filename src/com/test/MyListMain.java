package com.test;

import java.util.ArrayList;

public class MyListMain {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("A");
		listA.add("B");
		
		MyList<String> listB = new MyList<String>();
		listB.addAll(listA);
		System.out.println("   New "+listB);
		System.out.println(listB.add("C"));
		System.out.println("   After "+listB);
		

	}

}
