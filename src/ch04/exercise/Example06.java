package ch04.exercise;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				if(j==i) {
					System.out.println();
				}
			}
		}
	}
}
	