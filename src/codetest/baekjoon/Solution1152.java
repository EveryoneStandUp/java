package codetest.baekjoon;

import java.util.Scanner;

public class Solution1152 {
	public static void main(String[] args) {
//		String input1 = "The Curious Case of Benjamin Button";
//		String input2 = "The first character is a blank";
		String input3 = "The last character is a blank";
		Scanner scanner = new Scanner(input3);
		
		String line = scanner.nextLine();
		
		String[] arr = line.split(" ");
		int answer = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (!arr[i].equals("")) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
//		String res = "The Curious Case of Benjamin Button";
//		String[] arr1 = res.split(" ");
//	
//		System.out.println(arr1.length);
	}
}
