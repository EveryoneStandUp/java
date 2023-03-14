package ch15.exercise.exam05_07;

import java.util.*;

public class Exam05_07 {
	public static void main(String[] args) {
//		int[] array = {1, 5, 3, 8, 2};
		// of : 수정 불가 리스트 리턴
		List<Integer> list = List.of(1, 5, 3, 8, 2);
		
		int max = Integer.MIN_VALUE;
		// 위 리스트에서 최대값 구하는 코드 작성
		for (Integer e : list) {
			max = Math.max(max, e);
		}
		
		// 위와 같은 결과인 코드
//		 for (int i=0; i<list.size(); i++) {
//			 if(max < list.get(i)) {
//				 max = list.get(i);
//			 } 
//		 }
		 
		
		System.out.println(max);
	}
}
