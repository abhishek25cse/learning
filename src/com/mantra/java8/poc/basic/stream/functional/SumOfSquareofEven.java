package com.mantra.java8.poc.basic.stream.functional;

import java.util.ArrayList;

public class SumOfSquareofEven {

	
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(7);
		list.add(4);
		int sum = list.stream().filter(i-> i%2 == 0).mapToInt(Integer:: intValue).sum();
		System.out.println("1==> " +sum);
		sum = list.stream().filter(i-> i%2 == 0).reduce(0,(i,j)-> i+j);
		System.out.println("2==> " +sum);
		//System.out.println(sum);
	}

}
