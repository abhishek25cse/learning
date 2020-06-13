package com.mantra.problem.picseggregation;


public class MonthWiseSeggregation {
	
	
		public static void main(String[] a) {
		 System.out.println(Months.valueOf("AUG").value); 
		}
	

}

enum Months {
	
	 _01("01");
	/*, FEB("02"), MAR("03"), APR("04"), MAY("05"), JUNE("06"),JULY("07"),
	 AUG("08"), SEPT("09"), OCT("10"), NOV("11"), DEC("12");*/
	 String value ;
	 Months(String n) {
		 value = n;
	 }
	 
	 
	 
}
