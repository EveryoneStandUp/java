package practice2;

import java.util.*;

public class C03Count {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		
		list.stream()
			.forEach(s -> System.out.println(s));
		
		list.stream()
			.forEach(s -> System.out.println("원소: " + s));
	}
}
