package com.mantra.random;

public class Solution3 {

	public static void main(String[] args) {
	int N = 9736;
	System.out.println(solution(N));
	}
	
	static int solution(int N) {
        int largest = 0;
        int shift = 0;
        int temp = N;
        for (int i = 1; i < 30; ++i) {
            int index = (temp & 1);
            System.out.println(index);
            temp = ((temp >> 1) | (index << 29));
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }
        return shift;
    }

}
