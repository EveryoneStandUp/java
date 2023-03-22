package ch18.lecture.p03inputstream;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
//		try {
//			InputStream is = new FileInputStream("output/test1.db");
//			
//			while(true) {
//				int data = is.read(); // 1byte씩 읽기
//				
//				if(data == -1) break; // 파일 끝에 도달했을 경우
//				System.out.println(data);
//			}
//			
//			is.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try (InputStream is = new FileInputStream("output/test1.db");) {
			while(true) {
				int data = is.read(); // 1byte씩 읽기
				
				if(data == -1) break; // 파일 끝에 도달했을 경우
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
