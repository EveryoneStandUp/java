package ch18.lecture.p03inputstream;

import java.io.*;

public class C05InputStream {
	public static void main(String[] args) {
		String src = "output/whatthe.png";
		String des = "output/whatthe_copy.png";
		
		try(
			var is = new FileInputStream(src);
			var os = new FileOutputStream(des);
				) {
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
			System.out.println("복사완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
