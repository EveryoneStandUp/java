package practice;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			totalScore += val;
			
			if(val > maxScore) {
				name = key;
				maxScore = val;
			}
		}
		
		System.out.println((double)totalScore / map.size());
		System.out.println(maxScore);
		System.out.println(name);
	}
}
