package practice.lecture.p01exception;

public class C05MultipleException {
	public static void main(String[] args) {
		try {
			int[] a = {0, 1, 2};
			
			int c = 3 / a[3];
		
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
}
