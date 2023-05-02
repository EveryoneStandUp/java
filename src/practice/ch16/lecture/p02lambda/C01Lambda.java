package practice.ch16.lecture.p02lambda;

public class C01Lambda {
	public static void main(String[] args) {
		// functional interface로 lambda 식 만들 수 있음
		MyInterface01 o1 = () -> System.out.println("재정의 메소드@");
		MyInterface01 o2 = () -> System.out.println("또 다른 메소드@");
		o1.method1();
		o2.method1();
	}
}

@FunctionalInterface
interface MyInterface01 {
	void method1();
	
	String toString();
	
	default void method2() {
		
	}
	
	static void method3() {
		
	}
}
