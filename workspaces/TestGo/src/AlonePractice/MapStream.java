package AlonePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapStream {

	public static void main(String[] args) {
		Map<Integer, String> nummap = new HashMap<>();
		
		nummap.put(5, "�Ƹ޸�ī��");
		nummap.put(3, "������");
		nummap.put(1, "�ٴҶ��");
		nummap.put(6, "ī���ī");
		nummap.put(2, "ī��ḶŰ����");
		nummap.put(4, "���ǳӶ�");
		
		Stream<Integer> streamI = nummap.keySet().stream();
		streamI.forEach(System.out::print);
		
		System.out.println();
		
		Stream<String> streamS = nummap.values().stream();
		streamS.forEach(System.out::print);
		
	

	}

}
