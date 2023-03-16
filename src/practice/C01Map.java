package practice;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		// entry 추가
		map.put("kang", "slamdunk");
		map.put("serly", "avatar");
		map.put("maverick", "topgun");
		
		// entry의 수
		int size = map.size();
		System.out.println(size);
		
		map.put("kang", "baseball");
		
		System.out.println(map.size());
		
		// key로 value 얻기
		String v1 = map.get("serly");
		System.out.println(v1);
		System.out.println(map.get("kang"));
		
		// entry 지우기
		map.remove("kang");
		
		System.out.println(map.size());
		
		// 전체 탐색
		System.out.println("keyset----------------");
		Set<String> keys = map.keySet(); // 키 set 얻기
		for(String key : keys) {
			System.out.println(key + ":"  + map.get(key));
		}
		
		System.out.println("forEach-------------");
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println("entrySet---------------");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}

















