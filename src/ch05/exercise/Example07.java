package ch05.exercise;

import java.util.Arrays;

public class Example07 {
	// 확인문제 7번
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				// 내가 알고 있는 수보다 크면??
				max = array[i];
			}
			// 그렇지 않으면??
			
		}
		System.out.println(max);
	}
}
