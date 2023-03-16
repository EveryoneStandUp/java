package practice;

import java.util.*;

public class C03RemoveIf {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("javaa");
		set.add("jav");
		set.add("javab");
		set.add("ja");
		
		set.removeIf(e -> (e.length() % 2) == 0);
		
		System.out.println(set);
	}
}
