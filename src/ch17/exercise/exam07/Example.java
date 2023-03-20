package ch17.exercise.exam07;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);

		// 고전
		for(Member member : list) {
			if(member.getJob().equals("개발자")) {
				System.out.println(member.getName());
			}
		}
		
		System.out.println();
		
		// 스트림
		List<Member> developers = list.stream()
				.filter(m -> m.getJob().equals("개발자"))
				.toList(); // .collect(Collectors.toList());
				
			developers.stream()
				.forEach(m -> System.out.println(m.getName()));
	
	/*
			list.stream()
			.filter(member -> member.getJob().equals("개발자"))
			.map(Member::getName)
			.forEach(System.out::println);
	*/	
	}
}
