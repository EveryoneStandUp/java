package practice.p03intermediate;

import java.util.stream.*;

public class C12Map {
	public static void main(String[] args) {
		IntStream stream1 = IntStream.range(11, 20);
		
		Stream<Integer> stream2 = stream1.mapToObj(Integer::valueOf);
		
		long count = stream2.count();
		
		System.out.println(count);
	}
}
