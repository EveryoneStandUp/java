package practice.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C05Distinct {
	public static void main(String[] args) {
		Stream<Integer> stream
		= Stream.generate(() -> (int)(Math.random() * 45) + 1);
		
		stream
		.distinct()
		.limit(6)
		.forEach(System.out::println);
		
		// Random class 사용
		System.out.println("# random class #");
		Random random = new Random();
		
		Stream.generate(() -> random.nextInt(45) + 1)
		.distinct()
		.limit(6)
		.forEach(System.out::println);
	}
}
