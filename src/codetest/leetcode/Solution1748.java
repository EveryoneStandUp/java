package codetest.leetcode;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int n : nums) {
			map.putIfAbsent(n, 0); //Key 값이 존재하는 경우 Map의 Value의 값을 반환하고, Key값이 존재하지 않는 경우 Key와 Value를 Map에 저장하고 Null을 반환
			int oldValue = map.get(n);
			map.replace(n, oldValue + 1);
		}
		
		int sum = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			
			if(value == 1) {
				sum += entry.getKey();
			}
		}
		return sum;
	}
}