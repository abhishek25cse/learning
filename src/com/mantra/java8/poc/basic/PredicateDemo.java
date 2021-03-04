package com.mantra.java8.poc.basic;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] a) {		
		PredicateDemo.predicateEx();
		PredicateDemo.PredicateExString();
	}
	
	public static void predicateEx() {
		Predicate<Integer> pr = b -> ( b > 8);		
		System.out.println(pr.test(10));
		
	}
	
	public static void PredicateExString() {
		Predicate<String> stP = s-> s.equals("name");
		Predicate<String> stPN = s-> s.equals("name");
		System.out.println(stP.and(stPN).test("name"));		
		System.out.println(stP.or(stPN).test("name"));
	}

}
