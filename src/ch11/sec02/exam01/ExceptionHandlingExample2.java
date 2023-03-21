package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
			int result = data.length(); 		// data가 null일 경우 NullPointerException 발생
			System.out.println("문자 수: " + result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage()); // 1	예외정보를 얻는 방법
//			System.out.println(e.toString());   // 2	예외정보를 얻는 방법
//			e.printStackTrace(); 				// 3	예외정보를 얻는 방법
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}