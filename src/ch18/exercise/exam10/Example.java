package ch18.exercise.exam10;

import java.io.*;

public class Example {
	public static void main(String[] args) {

		// 파일명 입력 받는 코드(option)
		String origin = "output/whatthe.png";
		String copy = "output/whatthe_copy12.png";

		// 복사하는 코드 작성
		try (InputStream is = new FileInputStream(origin);
				OutputStream os = new FileOutputStream(copy);
				
				BufferedInputStream bis = new BufferedInputStream(is);
				BufferedOutputStream bos = new BufferedOutputStream(os);) {

			byte[] data = new byte[1024];
			int len = 0;
			while ((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
			}

			bos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
