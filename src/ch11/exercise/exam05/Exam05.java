package ch11.exercise.exam05;

public class Exam05 {
	
	public static void m1() {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method2() throws Exception {
		method1();
	}
	
	public static void m3() {
		try {
			method1();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void m4() {
		try {
			method1();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
}
