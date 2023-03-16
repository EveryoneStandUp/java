package ch15.lecture.p07treeset;

import java.util.*;

public class C02TreeSet {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.addAll(Set.of(3, 1, 20, 3000, 15, 7, 9, 2500, 100));
		
		System.out.println(set);
		
		// first
		System.out.println(set.first());
		
		// last
		System.out.println(set.last());
		
		// lower
		System.out.println(set.lower(20));
		System.out.println(set.lower(50));
		
		// higher
		System.out.println(set.higher(50));
		
		// floor
		System.out.println("floor");
		System.out.println(set.floor(50));
		System.out.println(set.floor(20)); // floor() 빈칸 안 숫자도 포함
	
		// ceiling
		System.out.println(set.ceiling(50));
		System.out.println(set.ceiling(100)); // ceiling() 빈칸 안 숫자도 포함
		
		// 거꾸로 정렬된 NavigableSet 리턴
		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println(descendingSet);
	}
}












