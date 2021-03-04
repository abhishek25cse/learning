package com.test;

public class DriverClassIsland {
	
	public static void main(String[] a) {
		int[][] matrix = new int[][]
		{{1,1,0}, {1,0,0},{0,0,0}};		
		System.out.println(countIsland(matrix, 3,3));
		
	}
	
	
	public static int countIsland(int[][] matrix, int rows, int cols) {
		int countIs = 0;
		rows = 3;
		cols = 3;
		for(int i =0;i<rows ; i++) {
			Boolean onIsland = Boolean.FALSE;
			for(int j=0; j<cols;j++) {			
				if(matrix[i][j] == 1  ) {
					if(i == 0 && !onIsland) {
						countIs ++;
						onIsland = Boolean.TRUE;
					}else if(!onIsland && matrix[i-1][j] != 1){
						countIs ++;
						onIsland = Boolean.TRUE;
					} else {
						onIsland = Boolean.FALSE;
					}
				}
			}
		}
		
		
		return countIs;
	}

}
