package practice;

import java.util.*;

public class C02Compare {
	public static void main(String[] args) {
		List<Person02> list1 = List.of(
				new Person02("son", 30),
				new Person02("cha", 50),
				new Person02("park", 40)
				);
		List<Person02> list2 = new ArrayList<>(list1);
				
		Person02 maxAge = Collections.max(list2, (a, b) -> a.getAge() - b.getAge());
	}
}

class Person02 {
	private String name;
	private int age;
	
	public Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
