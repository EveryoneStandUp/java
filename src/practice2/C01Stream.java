package practice2;

import java.util.stream.*;

public class C01Stream {
	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.of(5, 1, 3, 9, 10, 0);
		
		stream1.count();
		stream1.findFirst();
		
	}
}
