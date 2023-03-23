package practice.lecture.p01exception;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
}
