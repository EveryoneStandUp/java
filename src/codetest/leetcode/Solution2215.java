package codetest.leetcode;

import java.util.*;

public class Solution2215 {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		// 코드 작성
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int n : nums1) {
			set1.add(n);
		}
		
		for(int n : nums2) {
			set2.add(n);
		}
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		// code...
		list1.addAll(set1);
		list2.addAll(set2);
		
		list1.removeIf(e -> set2.contains(e));
		list2.removeIf(e -> set1.contains(e));
//		list1.removeIf(set2::contains);
//		list1.removeIf(set1::contains);
		
		return List.of(list1, list2);
		
	}
}