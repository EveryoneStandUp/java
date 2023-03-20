package ch17.exercise.exam05;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expression",
			"Java8 supports lambda expressions"
			);
//
//		list.stream()
//			.filter(n -> n.toLowerCase().contains("java"))
//			.forEach(System.out::println);

		list.stream()
		.filter(Example::havingJava)
		.forEach(System.out::println);

	}
	
	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}
}
