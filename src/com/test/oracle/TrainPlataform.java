package com.test.oracle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
Given arrival and departure times of all trains that reach a railway station.
Find the minimum number of platforms required for the railway station so
that no train is kept waiting.
Consider that all the trains arrive on the same day and leave
on the same day. Arrival and departure time can never be the same for
a train but we can have arrival time of one train equal to departure time
of the other. At any given instance of time, same platform can not be used
for both departure of a train and arrival of another train. In such cases,
we need different platforms.*/
/*
Input: n = 6 
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
Output: 3
Explanation: 
Minimum 3 platforms are required to 
safely arrive and depart all trains.*/

public class TrainPlataform {

	public static void main(String[] args) {
		int n = 6;
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		System.out.println("Total platform required is "+TrainPlataform.allocatePlatform(arr, dep,6));

	}

	public static int allocatePlatform(int arr[], int dep[], int totalTrains) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int d=0;
		int a=1;
		int totPlatOcc = 1;
		int maxPlat = 1;
		
		while (d<totalTrains && a<totalTrains) {
			if(arr[a] <= dep[d]) {
				totPlatOcc++;
				a++;
			} else if(arr[a] >= dep[d]){
				totPlatOcc--;
				d++;
			}
			
			if(maxPlat<totPlatOcc) {
				maxPlat=totPlatOcc;
			}
		}
		return maxPlat;		
	}
}
