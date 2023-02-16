package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class c02Arithmetic {
	public static void main(String[] args) {
		String input = """
				1 3
				""";
		
		Scanner scanner = new Scanner(input);
	
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		System.out.println(num1 / num2);

	}
}
