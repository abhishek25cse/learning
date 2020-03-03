package com.mantra.capture.info.hackerEarth;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EncryptionMain {

    // Complete the encryption function below.
    static String encryption(String s) {

        
        char[] s1 = s.replace("\\s", "").toCharArray();
        int len = s1.length;
        Double sqrt = Math.sqrt(len);
        int r = (int)(Math.floor(sqrt));
        int c =   (int)(Math.ceil(sqrt));
        while( (r*c) < len && c>=r ) r++;
        while(c==r && (r*c)<len) c++;
        System.out.println(r);
        System.out.println(c);
        char[][] grid = new char[r][c];
        int k = 0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(k<len) {
                grid[i][j] = s1[k];
                k++;
                System.out.print(grid[i][j]);
                }
                
            }
            System.out.print("\n");
        }
        
        StringBuffer finalStr = new StringBuffer();
        for(int i=0;i<c;i++) {
            for(int j=0;j<r;j++) {   
            	if(grid[j][i]>='a' && grid[j][i]<='z' ) {
                finalStr.append(grid[j][i]) ;      
            	}
            }
             finalStr.append(" ") ;    
        }
        return finalStr.toString().trim();}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       String in = "feedthedog";
       System.out.println(encryption(in));
    }
}
