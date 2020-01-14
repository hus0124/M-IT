package AlonePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapStream {

	public static void main(String[] args) {
		Map<Integer, String> nummap = new HashMap<>();
		
		nummap.put(5, "아메리카노");
		nummap.put(3, "연유라떼");
		nummap.put(1, "바닐라라떼");
		nummap.put(6, "카페모카");
		nummap.put(2, "카라멜마키아토");
		nummap.put(4, "토피넛라떼");
		
		Stream<Integer> streamI = nummap.keySet().stream();
		streamI.forEach(System.out::print);
		
		System.out.println();
		
		Stream<String> streamS = nummap.values().stream();
		streamS.forEach(System.out::print);
		
	

	}

}
