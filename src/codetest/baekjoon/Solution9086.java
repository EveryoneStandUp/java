package codetest.baekjoon;

import java.util.Scanner;

public class Solution9086 {
	public static void main(String[] args) {
		String input = """
				3
				ACDKJFOWIEGHE
				O
				AB
				""";

		Scanner scanner = new Scanner(input);
		int loop = scanner.nextInt();
		
		for (int i=0; i<loop; i++) {
			String str = scanner.next();
			
			char first = str.charAt(0);
			char last = str.charAt(str.length()-1);
			
			System.out.println(first + last);
		}
	}
}
