package practice;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java1");
		set.add("Java2");
		set.add("Java3");
		set.add("Java1");
		set.add("Java4");
		
		int size = set.size();
		System.out.println(size);
	}
}
