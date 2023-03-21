package practice.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C14FlatMap {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(3, 4, 5);
		
		long count1 = list.stream()
				.map(e -> e)
				.count();
		
		System.out.println(count1);
		
		long count2 = list.stream()
				.flatMap(e -> Stream.of(0, 0))
				.count();
		
		System.out.println(count2);
	}
}
