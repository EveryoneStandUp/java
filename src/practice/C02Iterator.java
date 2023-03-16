package practice;

import java.util.*;

public class C02Iterator {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String n = iter.next();
			
			if((n.length() % 2) == 0) {
				iter.remove();
			}
		}
		System.out.println(set);
	}
}
