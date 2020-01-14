package AlonePractice;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<>();
		
		scores.put("Ken",100);
		scores.put("Shin",60);
		scores.put("Jung",80);
		
		System.out.println(scores.toString());

	}

}
