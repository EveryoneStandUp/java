package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyOfExample187 {
	public static void main(String[] args) {
		int[] oldStrArray = {1, 2, 3};
		
		int[] newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length+2);
		
		System.out.println(Arrays.toString(newStrArray));
	}
}
