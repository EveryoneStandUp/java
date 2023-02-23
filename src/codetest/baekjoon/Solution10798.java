package codetest.baekjoon;

import java.util.Scanner;

public class Solution10798 {
	public static void main(String[] args) {
		String input = """
				ABCDE
				abcde
				01234
				FGHIJ
				fghij
			""";
		
		Scanner scanner = new Scanner(input);

		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		String str3 = scanner.nextLine();
		String str4 = scanner.nextLine();
		String str5 = scanner.nextLine();
		
		String[] a = input.split(""); 
		
		for(int i=0; i<=5; i++) {
		System.out.print(a[i]);
		}
	}
}
