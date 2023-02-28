package ch06.lecture.p04static;

public class MyClass05 {
	// instance field
	String name;
	
	// static field
	static String model;
	
	// instance method
	void printName() {
		System.out.println(model);
		System.out.println(name);
	}
	
	// static method
	static void printModel() {
		System.out.println(model);
		
//		 static member에서
//		 instance member 접근할 수 없음
//		System.out.println(name); // 안됨
	}
}
