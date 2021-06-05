package com.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Prison Break
Programmer Sam is planning to escape from prison! The prison's gate consists of horizontal and vertical bars that are spaced one unit apart, so the area of each hole between the bars is 1 × 1. Sam manages to remove certain bars and make some of these holes bigger. Determine the area of the largest hole in the gate after the bars are removed.

For example, consider the diagram below. The left image depicts the initial prison gate with n = 6 horizontal and m = 6 vertical bars, where the area of the biggest hole in the bars is 1 × 1. The right image depicts that same gate after Sam removes horizontal bar 4 and vertical bar 2, at which point the area of the biggest hole in the bars becomes 2 × 2 = 4:

Function Description Complete the function prison in the editor below. The function must return a long integer denoting the area of the biggest hole in the prison gate's bars.

prison has the following parameter(s): n: integer, the number of horizontal bars initially m: integer, the number of vertical bars initially h[h[0],...h[x-1]]: an array of integers, the horizontal bars to remove v[v[0],...v[y-1]]: an array of integers, the vertical bars to remove

Constraints 1 ≤ n, m ≤ 105 0 ≤ x ≤ n 0 ≤ y ≤ m 1 ≤ h[i] ≤ n, where 1 ≤ i ≤ n. 1 ≤ v[j] ≤ m, where 1 ≤ j ≤ m. It is guaranteed that values in array h are distinct. It is guaranteed that values in array v are distinct.

Input Format for Custom Testing Input from stdin will be processed as follows and passed to the function.

The first line contains an integer n. The second line contains an integer m. The third line contains an integer x, the size of the array h. Each of the next x lines contains an integer h[i] where 0 ≤ i < n. The next line contains an integer y, the size of the array v. Each of the next v lines contains an integer v[j] where 0 ≤ j < m.

Sample Case 0 Sample Input 0 3 3 1 2 1 2

Sample Output 0 4

Explanation 0 Bar counts are h = [2] and v = [2]. This means that Sam removes horizontal bar 2 and vertical bar 2 from the gate, so it looks like this:

*/
public class PrisonBreak {

    static long prison(int n, int m, int[] h, int[] v) {
        ArrayList<ArrayList<Long>> prison=new ArrayList<ArrayList<Long>>();
		for(int r=0;r<=n;r++){
			ArrayList<Long> temp=new ArrayList<Long>();
			for(int c=0;c<=m;c++){
				temp.add((long) 1);
			}
			prison.add(temp);
		}
		
		int[] x=h;
        int xnum=x.length;
		Arrays.sort(x);
		int[] y=v;
        int ynum=y.length;
		Arrays.sort(y);
		
		//removing bar i means that list at i-1 and at i
		for(int a=xnum-1;a>=0;a--){
			int i=x[a];
			for(int cell=0;cell<prison.get(i).size();cell++){
				prison.get(i).set(cell, prison.get(i).get(cell)+prison.get(i-1).get(cell));
			}
			prison.remove(i-1);
		}
		
		
		ArrayList<ArrayList<Long>> newprison =new ArrayList<ArrayList<Long>>();

		for(int col=0;col<prison.get(0).size();col++){
			ArrayList<Long> temp=new ArrayList<Long>();
			for(int row=0;row<prison.size();row++){
				temp.add(prison.get(row).get(col));
			}
			newprison.add(temp);
		} 
		
		for(int b=ynum-1;b>=0;b--){
			int i=y[b];
			for(int cell=0;cell<newprison.get(i).size();cell++){
				newprison.get(i).set(cell, newprison.get(i).get(cell)+newprison.get(i-1).get(cell));
			}
			newprison.remove(i-1);
		}
		
		long max=1;
		for(ArrayList<Long> arr:newprison){
			for(long num:arr){
				if(num>max)
					max=num;
			}
		}
        return max;
    }
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        long res;
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        int _m;
        _m = Integer.parseInt(in.nextLine().trim());
        
        
        int _h_size = 0;
        _h_size = Integer.parseInt(in.nextLine().trim());
        int[] _h = new int[_h_size];
        int _h_item;
        for(int _h_i = 0; _h_i < _h_size; _h_i++) {
            _h_item = Integer.parseInt(in.nextLine().trim());
            _h[_h_i] = _h_item;
        }
        
        
        int _v_size = 0;
        _v_size = Integer.parseInt(in.nextLine().trim());
        int[] _v = new int[_v_size];
        int _v_item;
        for(int _v_i = 0; _v_i < _v_size; _v_i++) {
            _v_item = Integer.parseInt(in.nextLine().trim());
            _v[_v_i] = _v_item;
        }
        
        res = prison(_n, _m, _h, _v);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}