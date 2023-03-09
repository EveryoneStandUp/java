package ch12.lecture.p02wrapper;

public class C06UnBoxing {
	public static void main(String[] args) {
		int i1 = 30000;
		int i2 = 30000;
		
		Integer o1 = i1; // Boxing
		Integer o2 = i2; // Boxing
		
		System.out.println(o1 == o2);
		
		int i3 = o1; // Unboxing
		int i4 = o2; // Unboxing
		
		System.out.println(i3 == i4);
	}
}
