package com.mantra.java8.poc.basic.map;

import java.util.HashMap;

public class MapMain {

	public static void main(String[] args) {
		Employee e = new Employee("a",1);
		Employee e1 = new Employee("a",1);
		Employee e2 = new Employee("a",1);
		
		HashMap<Integer, Employee> myMap = new HashMap<>();
		myMap.put(1, e);
		myMap.put(2, e2);
		myMap.put(3, e1);
		
		System.out.println(myMap);

	}

}
