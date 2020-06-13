package com.mantra.capture.info.hackerEarth;

/*
 * Missing Digit
	Have the function MissingDigit(str) take the str parameter, which will be a simple mathematical formula with three numbers, a single operator (+, -, *, or /) and an equal sign (=) and return the digit that completes the equation. In one of the numbers in the equation, there will be an x character, and your program should determine what digit is missing. For example, if str is "3x + 12 = 46" then your program should output 4. The x character can appear in any of the three numbers and all three numbers will be greater than or equal to 0 and less than or equal to 1000000.
	Examples
	Input: "4 - 2 = x"
	Output: 2
	Input: "1x0 * 12 = 1200"
	Output: 0*/
public class BlackRockTest {

	public static void main(String[] a) {
		String res = null;
		String str = "24 / 2 = x2";
		res = BlackRockTest.processingStart(str);
		System.out.println(res);
	}
	
	public static String processingStart(String equation) {
		String equationArr[] = equation.split("=");
		String lhs = equationArr[0];
		String rhs = equationArr[1];
		Boolean isLhs =  lhs.contains("x")?Boolean.TRUE:Boolean.FALSE;
		String[] nums = lhs.split("\\*|\\+|\\-|/");
		String op = BlackRockTest.findOperator(lhs);
		//Arrays.stream(nums).forEach(num-> System.out.println(num));
		//System.out.println("op = "+op);
		Integer result = null;
		String eleWithX = rhs;
		if(!isLhs) {
			result = BlackRockTest.opertion(Integer.parseInt(nums[0].trim()),Integer.parseInt(nums[1].trim()), op);
		}else {			
			op = flipOperator(op);
			//System.out.println(op);
			if(nums[0].contains("x")) {
				eleWithX =nums[0]; 
				result = BlackRockTest.opertion(Integer.parseInt(rhs.trim()),Integer.parseInt(nums[1].trim()), op);
				
			}else {
				eleWithX =nums[1]; 
				result = BlackRockTest.opertion(Integer.parseInt(rhs.trim()),Integer.parseInt(nums[0].trim()), op);			
			}				
		}		
		//System.out.println("op = "+op);
		//System.out.println(result);
		int posi = eleWithX.trim().indexOf("x");
		//System.out.println(String.valueOf(result).charAt(posi));
		 return String.valueOf(result).charAt(posi)+"";
	}
	
	public static String flipOperator (String op) {
		return op=="+"?"-": op=="-"?"+":op=="*"?"/":op=="/"?"*":null;
	}
	public static String findOperator(String lhs) {
		String op = null;
		op = lhs.contains("+") ?"+":lhs.contains("-")?"-":lhs.contains("*")?"*":lhs.contains("/")?"/":"";
		return op;
	}
	
	public static Integer opertion(Integer one , Integer two , String op) {
		Integer res = null;
		switch(op) {
		case "+":
			res=  one+two;
			break;
		case "-":
			res= one-two;
			break;
		case "*":
			res = Math.multiplyExact(one, two);
			break;
		case "/":
			res = Math.floorDiv(one, two);
			break;
		}
		return res;
	}

}
