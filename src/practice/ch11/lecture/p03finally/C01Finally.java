package practice.ch11.lecture.p03finally;

public class C01Finally {
	public static void main(String[] args) {
		try {
			int a = 0;
			int c = 3 / a;
			
			System.out.println("try block continue....");
		} catch(ArithmeticException e) {
			System.out.println("exception!!!");
		} finally {
			System.out.println("finally block@@@");
		}
		
		System.out.println("continue...");
	}
}
