package com.sd;

import java.util.ArrayList;
import java.util.Collections;

public class SteamExample {
	
	public static void main (String[] a) {
		
		Employee e1= new Employee(1,"A");
		Employee e2 = new Employee(2,"B");
		Employee e3= new Employee(4,"D");
		Employee e4= new Employee(3,"C");
		Employee e5= new Employee(6,"Z");
		Employee e6= new Employee(10,"E");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		
		Collections.sort(empList);
		
		empList.stream().forEach(e -> 
		System.out.println("The name "+e.getName() +"  "+e.getId())
		);
		
	}

}
