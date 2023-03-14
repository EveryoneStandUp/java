package ch15.exercise.exam05_08;

import java.util.*;

public class Exam05_08 {
	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};

		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88));
		
		//문제 6
		System.out.println(list.size()); //? 3
		System.out.println(list.get(2).size()); //? 5
		
		// 문제 8
		// 합, 평균 구하기
		int sum = 0;
		int cnt = 0;
		for(List<Integer> l : list) {
			for(Integer s : l) {
				sum += s;
				cnt++;
			}
		}
		double avg = (double)sum / cnt;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}
}