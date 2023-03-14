package ch15.exercise.exam05_09;

import java.util.*;

public class Exam05_09 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
//		int[] scores = null;
		List<Integer> scores = new ArrayList<>();
		int numOfStudent = 0;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");

			int menu = scanner.nextInt();

			switch (menu) {
			case 1 -> {
				// 학생수 입력
				System.out.print("학생수>");
				numOfStudent = scanner.nextInt();
			}
			case 2 -> {
				// 점수 입력
				for (int i = 0; i < numOfStudent; i++) {
					System.out.print("scores[" + i + "]>");
					int score = scanner.nextInt();
					scores.add(score);
				}
			}
			case 3 -> {
				// 점수리스트 출력
				for (int i = 0; i < numOfStudent; i++) {
					System.out.println("scores[" + i + "]: " + scores.get(i));
				}
			}
			case 4 -> {
				// 분석(최대값, 평균)
				int max = 0;
				double avg = 0;
				for (int e : scores) {
					max = Math.max(max, e);
					avg += e;
				}
				avg /= scores.size();
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);

			}
			case 5 -> {
				// 종료
				run = false;
			}
			}
		}

		System.out.println("프로그램 종료");
	}
}
