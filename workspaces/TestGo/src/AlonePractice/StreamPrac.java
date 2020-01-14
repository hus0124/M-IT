package AlonePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrac {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "HA");
		map.put("2", "Ho");
		map.put("3", "Hu");
		
		Stream<String> stream = map.values().stream();
		stream.forEach(System.out::println);

		Stream<String> streamA = map.keySet().stream();
		streamA.forEach(System.out::println);
		
		IntStream stream1 = IntStream.range(1,5);
		stream1.forEach(System.out::print);
		
		System.out.println();
		
		IntStream stream2 = IntStream.rangeClosed(1,5);
		stream2.forEach(System.out::print);
	}

}
