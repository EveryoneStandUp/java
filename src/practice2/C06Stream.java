package practice2;

import java.util.*;
import java.util.stream.*;

public class C06Stream {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("java", "spring", "css");
		
		IntStream stream2 = IntStream.of(1, 2, 3, 4);
		LongStream stream3 = LongStream.of(5, 6, 7, 8);
		DoubleStream stream4 = DoubleStream.of(3.14, 9.8, 7.1, 12.12);
		
		int[] intarr = {9, 10, 11, 12};
		IntStream stream5 = Arrays.stream(intarr);
	}
}
