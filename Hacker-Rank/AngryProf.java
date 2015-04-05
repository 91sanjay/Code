package com.sanjay.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProf {
    /* Angry Professor - The input format is
     * N - number of test cases
     * M K - M = size of input for a given test case ; K = minimum attendance reqd to conduct class
     * Input - The arrival time of M students
     * 
     * Given the arrival time of M students,check if the professor cancels the class.
     * Professor will cancel if a minimum of K students are not present before the class starts.
     * Arrival time = negative/0 indicates the student arrived before the class started
     * Arrival time = positive indicates the student arrived after the class started
     * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer size = in.nextInt() * 2;
		List<String> result = new ArrayList<String>();
		
		while (size > 0) {
			Integer inputSize = in.nextInt();
			Integer minReq = in.nextInt();
			
			while (inputSize > 0) {
				Integer input = in.nextInt();
				
				if (input<=0)
					minReq--;
				
				inputSize--;
			}
			
			if(minReq > 0)
				result.add("YES");
			else
				result.add("NO");
			
			size -= 2;
		}
		in.close();
		
		for (String string : result) {
			System.out.println(string);
		}
	}
}
