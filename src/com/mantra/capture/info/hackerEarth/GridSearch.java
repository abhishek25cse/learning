package com.mantra.capture.info.hackerEarth;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GridSearch {
	    // Complete the gridSearch function below.
	static String gridSearchOne(String[] G, String[] P) {
		String isPresent = "NO";
		int first = 9999;
		int second = 9999;
		int rowsMatch = 0;
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < P.length; j++) {
				if (G[i].contains(P[j])) {
					if (isPresent.equalsIgnoreCase("YES")) {
						second = first;
						first = G[i].indexOf(P[j]);
						if (first != second) {
							isPresent = "NO";
							rowsMatch = 0;
						} else {
							isPresent = "YES";
							rowsMatch++;
						}
					} else {
						rowsMatch = 1;
						first = G[i].indexOf(P[j]);
						isPresent = "YES";
					}
				}
			}
		}

		if (rowsMatch == P.length && isPresent.equalsIgnoreCase("YES")) {
			return isPresent;
		} else {
			return "NO";
		}

	}

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            String[] RC = scanner.nextLine().split(" ");

	            int R = Integer.parseInt(RC[0]);

	            int C = Integer.parseInt(RC[1]);

	            String[] G = new String[R];

	            for (int i = 0; i < R; i++) {
	                String GItem = scanner.nextLine();
	                G[i] = GItem;
	            }

	            String[] rc = scanner.nextLine().split(" ");

	            int r = Integer.parseInt(rc[0]);

	            int c = Integer.parseInt(rc[1]);

	            String[] P = new String[r];

	            for (int i = 0; i < r; i++) {
	                String PItem = scanner.nextLine();
	                P[i] = PItem;
	            }

	            String result = gridSearch(G, P);
	            System.out.println(result);

	         //   bufferedWriter.write(result);
	         //   bufferedWriter.newLine();
	        }

	        //bufferedWriter.close();

	        scanner.close();
	    }
	    
	    
	    static char[][] createAGrid(String[] G) {
	    	int R = G.length;
	    	int C =  G[0].length();	  
	    	char g[][] = new char[R][C];
	    	for (int i=0 ; i<R;i++) {	    		
	    		g[i] = G[i].toCharArray();
	    	}
	    	return g;
	    }
	    static String gridSearch(String[] G, String[] P) {	    	
	    	char[][] g = createAGrid(G);
	    	char[][] p = createAGrid(P);
	    	int R = G.length;
	    	int C =  G[0].length();	 
	    	int r = P.length;
	    	int c =  P[0].length();	  
	    	int match = 0;
	    	
	    	int curriP = 0;
	    	int currjP = 0;
	    	int strtG = 0;
	    	int i=0;
	    	int j=0;
	    	//for(int i=0;i<R;i++) {
	    		while (i<R && curriP<r ) {
	    		if(!G[i].contains(P[curriP])) {
	    			curriP =0;
	    			currjP =0;
	    			match = 0;	    			
	    			System.out.println("Did not match "+i);
	    			i++;
	    			j=0;
	    			continue;
	    			
	    		}
	    		//for(int j=0;j<C;j++) {
	    		System.out.println(g[i][j] + "    ===  "+p[curriP][currjP]);
		    		if(g[i][j] == p[curriP][currjP]) {	
		    			
		    			if(currjP<(c-1)) {
		    				currjP++;
			    		} else {
			    			curriP++;
			    			currjP =0;
			    			
			    		}    			
		    	     } else {
		    			curriP =0;
		    			currjP =0;
		    		}
		    		if(j<(C-1)) {
		    			j++;
		    		} else {
		    			i++;
		    		}
		    		if(currjP == c) {
		    			System.out.println(i+"MATCH  match "+curriP);
		    			curriP++;
		    			currjP =0;
		    			match ++;	
		    			i++;
		    			j=j-c;
		    			continue;
		    		}
	    	    }
	    	//}
	    	if(match==r ) {
	    		return "YES";
	    	} else {
	    		return "NO";
	    	}    	

		}
	

	    
}


