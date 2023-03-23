package practice.lecture.p01exception;

public class C01TryCatch {
	public static void main(String[] args) {
		
		try {
			int a = 0;
			int b = 3;
			
			int c = b / a;
			
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		}
		
		System.out.println("continue...");
	}
}
