package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MainCompliment {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    StringBuffer finalString = new StringBuffer();
    while ((line = in.readLine()) != null && line.length()!=0 ) {
     // System.out.println(MainCompliment.compliment(line));
      if(finalString.length()==0) {
    	  finalString.append(MainCompliment.getSmallest(line));
      } else {
    	  finalString.append(" ");
    	  finalString.append(MainCompliment.getSmallest(line));
    	  
      }
      
    }
    System.out.println(finalString.toString());
  }
  
  public static String compliment(String line) {
    char[] chArray = line.toCharArray();
    StringBuffer finalLine = new StringBuffer();
    System.out.println("Methof");
    for (char ch : chArray) {
      if(ch == '1') {
        finalLine.append('0');
      } else if(ch == '0') {
        finalLine.append('1');
      }
    }
    return finalLine.toString();
  } 
  
  public static String getSmallest(String line) {
	  String[] arrayInt = line.split(" ");
	  if(arrayInt.length<=0) {
		  return " ";
	  }
	  int smallest = Integer.parseInt(arrayInt[0]);
	  for(String s : arrayInt) {
		  int num = Integer.parseInt(s);
		  if(num > 0) {
			  if(num < smallest || smallest<0) {
				 smallest = num; 
			  }
		  }
	  }
	  return String.valueOf(smallest);
	  
	  
  }
}