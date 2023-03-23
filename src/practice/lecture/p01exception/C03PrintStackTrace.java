package practice.lecture.p01exception;

public class C03PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 3;
			
			int c = b / a;
			
			System.out.println("try block continue....");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("program continue...");
	}
}
