package ch17.exercise.exam05;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expression",
			"Java8 supports lambda expressions"
			);
		
		for (String e : list) {
			if(e.toLowerCase().contains("java")) {
				System.out.println(e);
			}
		}
	}
}