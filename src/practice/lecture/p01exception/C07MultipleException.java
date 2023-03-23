package practice.lecture.p01exception;

public class C07MultipleException {
	public static void main(String[] args) {
		try {
			int[] a = {0, 1};
			
			int c = 3 / a[2];
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("continue....");
	}
}
