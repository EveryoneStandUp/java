package practice.p03intermediate;

import java.util.stream.*;

public class C13Boxed {
	public static void main(String[] args) {
		IntStream stream1 = IntStream.range(1, 10);
		Stream<Integer> stream2 = stream1.boxed();
		
		DoubleStream stream3 = DoubleStream.of(3.14, 9.99);
		Stream<Double> stream4 = stream3.boxed();
	}
}
