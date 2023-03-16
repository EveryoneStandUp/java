package practice;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(30);
		set.add(90);
		set.add(3);
		set.add(7);
		set.add(90);
		
		int size = set.size();
		System.out.println(size);
		System.out.println(set);
		
		set.remove(3);
		System.out.println(set.size());
		System.out.println(set);
		
		System.out.println("향상된 for");
		for(Integer e : set) {
			System.out.println(e);
		}
		
		System.out.println("Iterator");
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("forEach");
		set.forEach(e -> System.out.println(e));
	
		System.out.println("forEach1");
		set.forEach(System.out::println);
	}	
}
