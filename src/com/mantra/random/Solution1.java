package com.mantra.random;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(solution("0 - 22 1985--324"));

	}
	 public static String solution(String S) {
	        // write your code in Java SE 8		
	        char[] input = S.toCharArray();
	        StringBuffer output = new StringBuffer();
	        int count =0;
	        int len= input.length;
	        int rem = len%3;
	        
	        String delimit = "-";
	        int pos = 0;
	        for(char c : input) {
	            if(Character.isDigit(c)) {
	                if(count>=3) {
	                    count =1;
	                    output.append(delimit);
	                    output.append(c);
	                } else {
	                    if(rem ==1 && pos== len-2) {
	                        count =1;
	                        output.append(delimit);
	                        output.append(c);
	                    } else {
	                     output.append(c);
	                     count++;
	                    }
	                }
	            }
	            pos++;
	        }
	        return output.toString();
	    }
}
