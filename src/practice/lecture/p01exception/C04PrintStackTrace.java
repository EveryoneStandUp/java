package practice.lecture.p01exception;

public class C04PrintStackTrace {
	public static void main(String[] args) {
		// unchecked exception
		
		try {
			String a = "java";
			System.out.println(a.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
