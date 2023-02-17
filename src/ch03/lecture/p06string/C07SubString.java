package ch03.lecture.p06string;

public class C07SubString {
	public static void main(String[] args) {
		// substring
		// 문자열의 일부(substring)을 리턴
		// return type : String
		
		String str1 = "중국 재개방이 글로벌 인플레이션 촉발하지 않는 이유";
		// 첫 번째 parameter : 시작 index(포함)
		// 두 번째 parameter : 종료 index(포함안됨)
		String res1 = str1.substring(0, 2);
		System.out.println(res1);
		
		System.out.println(str1.substring(3, 6));
		System.out.println(str1.substring(8, str1.length()));

		// parameter 하나 : 시작 ~ 끝까지
		System.out.println(str1.substring(8));
		
		System.out.println(str1.substring(str1.length()-2));
	
		// parameter가 index를 벗어나면 오류
		String str2 = "java";
		System.out.println(str2.substring(2, 4));
	}
}
