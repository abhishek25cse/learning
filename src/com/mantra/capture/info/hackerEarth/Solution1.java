package com.mantra.capture.info.hackerEarth;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution1 {

    /*
     * Complete the timeConversion function below.
     */
	static String timeConversion(String s) {
		BigInteger b = BigInteger.ONE;
		HashSet sub = new HashSet<Integer>();
		//sub.
		 char[] searchString ;//= //{'h',a,c,k,e,r,r,a,n,k};
				
		String finalTime = null;
		
		if (s.contains("PM") || s.contains("pm")) {
			finalTime = s.replace("PM", "");
			int i = Integer.parseInt(finalTime.substring(0, 2));
			int j = i + 12;
			finalTime = finalTime.replace(String.valueOf(i), String.valueOf(j));
		} else {
			finalTime = s.replace("AM", "");
		}
		return finalTime;
	}

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}