package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] arr = new int[] {2, 4, 6};
	
		method1(arr);
		
		System.out.println(arr[0]); // 2? or 3?
	}
	public static void method1(int[] arr2) {
		arr2 = new int[] {3, 5, 7};
	}
}
