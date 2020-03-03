package com.mantra.random;

public class CharSequence {

	/*Replace 
	AABBCDDDD  --> 2A2BC4D
	if count >4 then divide it into multiple of 4
	eg
	AAAAAB --> 4A1AB
	do not use any extra array 
	*/
	public static void main(String[] args) {
		String input = "AABBBBBC";
		String currSeq = null;
		int count=0;
		for(int i=0;i<input.length(); i++) {
			
			if(null == currSeq || input.charAt(i) == currSeq.charAt(0)) {
				if(null ==  currSeq ) {
					currSeq= Character.toString(input.charAt(i));
				} else {
				currSeq= currSeq + input.charAt(i);
				}
				count++;
			} else {
				String repl = currSeq.length()+""+currSeq.charAt(0);
				System.out.println(repl);
				input= input.replaceAll(currSeq, repl);
				count =1;
				currSeq = Character.toString(input.charAt(i));;
			}
		}
		System.out.println(input);
	}

}
