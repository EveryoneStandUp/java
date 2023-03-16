package practice;

import java.util.*;

public class C04Contains {
	public static void main(String[] args) {
		Set<String> set = Set.of("java", "css", "html", "jsp");
		
		System.out.println(set.contains("java"));
		System.out.println(set.contains("css"));
		System.out.println(set.contains("python"));
		System.out.println(set.contains(new String("java")));
	}
}
