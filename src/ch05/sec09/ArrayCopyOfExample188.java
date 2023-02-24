package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyOfExample188 {
	public static void main(String[] args) {
		// 길이 3인 배열
		String[] oldStrArray = {"java", "array", "copy"};
		
		String[] newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length+2);
		
		System.out.println(Arrays.toString(newStrArray));
	}
}
