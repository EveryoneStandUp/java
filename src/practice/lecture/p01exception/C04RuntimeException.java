package practice.lecture.p01exception;

import java.util.*;

public class C04RuntimeException {
	public static void main(String[] args) {
		var list = new ArrayList<>();
		list.add("java");
		
		System.out.println(list.get(1));
		
		System.out.println("continue...");
	}
}
