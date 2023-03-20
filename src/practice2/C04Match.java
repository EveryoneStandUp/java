package practice2;

import java.util.*;

public class C04Match {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(3, 5, 7, 9, 10);
		
		boolean r1 = list.stream().allMatch(e -> e > 0);
		System.out.println(r1);
		
		boolean r2 = list.stream().anyMatch(e -> e < 0);
		System.out.println(r2);
		
		boolean r3 = list.stream().noneMatch(e -> e < 0);
		System.out.println(r3);
		
	}
}
