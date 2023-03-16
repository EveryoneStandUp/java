package practice;

import java.util.*;

public class C01Collections {
	public static void main(String[] args) {
		List<String> list1 = List.of("j", "c", "s", "p", "h");
		
		List<String> list2 = new ArrayList<>(list1);
		
		Collections.sort(list2);
		System.out.println(list2);
		
		String maxStr = Collections.max(list1);
		System.out.println(maxStr);
		
		String minStr = Collections.min(list1);
		System.out.println(minStr);
		
		Collections.reverse(list2);
		System.out.println(list2);
		
		Collections.fill(list2, "web");
		System.out.println(list2);
	}
}
