package com.test.oracle;

import java.util.Date;

public class EmployeeSingleton {
	
	private EmployeeSingleton instance; 
	
	private int id  ;
	private  String name ;
	private  Date DOB;
	
	public synchronized EmployeeSingleton getInstance(int id, String name, Date dOB) {
		if(null == instance ) {
			instance = new  EmployeeSingleton(id, name,dOB);
		} else {
			//check the values if all are same
		}		
		return instance;
		
	}
	
	
	private EmployeeSingleton(int id, String name, Date dOB) {	
		if(null != instance ) {
			/*
			 * instance = new EmployeeSingleton(); instance.setId(id); ins
			 */
		}
		
	}


	
	

	 
	 
	

}
