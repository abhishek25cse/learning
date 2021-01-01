package com.mantra.java8.poc.basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.mantra.model.Employee;

public class ComparatorDemo {
	
	public static void main(String[] a) {
		ComparatorDemo.comparatorCheckWithLambda();
	}
	
	public static void comparatorCheckWithLambda() {
		List<Employee> emps =  ComparatorDemo.createList();		
		Comparator<Employee> compEmp = (e1,e2) ->{
			return e2.getName().compareTo(e1.getName());
		};
		System.out.println("The before  list using lambda = "+ emps);
		emps.sort(compEmp);		
		System.out.println("The sorted list using lambda = "+ emps);
		
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

}
