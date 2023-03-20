package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
	
		// Student를 score 스트림으로 변환
		studentList.stream()
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
	
		
		// 최대 점수
		System.out.println("최대점수########");
		int max = studentList.stream()
			.mapToInt(x -> x.getScore()) // .maxToInt(Student::getScore)
			.max()
			.getAsInt();
		
		System.out.println(max);
		
		
		// 최소 점수
		System.out.println("최소점수#########");
		int min = studentList.stream()
				.mapToInt(x -> x.getScore())
				.min()
				.getAsInt();
		
		System.out.println(min);
		
		// 총합
		System.out.println("총합##########");
		int sum = studentList.stream()
				.mapToInt(x -> x.getScore())
				.sum();
		
		System.out.println(sum);
		
		
		// 평균
		System.out.println("평균############");
		double avg = studentList.stream()
				.mapToDouble(x -> x.getScore())
				.average()
				.getAsDouble();

		System.out.println(avg);
		
		// 통계
		System.out.println("통계###############");
		IntSummaryStatistics summary = studentList.stream()
			.mapToInt(Student::getScore)
			.summaryStatistics();
	
		System.out.println("최대: " + summary.getMax());
		System.out.println("최소: " + summary.getMin());
		System.out.println("합: " + summary.getSum());
		System.out.println("평균: " + summary.getAverage());
	}
	
}
