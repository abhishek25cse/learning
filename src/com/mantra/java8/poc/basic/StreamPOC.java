package com.mantra.java8.poc.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mantra.model.Employee;

public class StreamPOC {

	public static void main(String[] args) {
		StreamPOC.streamMap();

	}
	
	public static List<Employee> createList() {
		List<Employee> emps = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emps.add(emp3);
		emps.add(emp2);
		emps.add(emp1);		
		emp3.setDept("A");
		emp3.setId(1);
		emp3.setName("AAAA");
		emp1.setDept("B");
		emp1.setId(2);
		emp1.setName("BBBB");
		emp2.setDept("C");
		emp2.setId(3);
		emp2.setName("CCCC");
		return emps;		
	}
	
	public static void streamMap() {
		List<Employee> emps = createList();
		System.out.println("*******************************************************");
		System.out.println("List coverted to map =");
		emps.stream().collect(Collectors.toMap(Employee:: getId, Employee-> Employee)).
				forEach((k,v) -> System.out.println(k + "  "+ v));
		System.out.println("*******************************************************");		
	}
	
	

}
