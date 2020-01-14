package arrayBaekjun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraypractice2{

	public static void main(String[] args) {
						 
		ArrayList<String> ssort = new ArrayList<String>();
				 
		ssort.add("5");
		ssort.add("3");
		ssort.add("6");
		ssort.add("1");
		ssort.add("9");
		 
		Collections.sort(ssort);
		System.out.println("오름차순");
		for (int i=0; i < ssort.size(); i++) {
			System.out.print(ssort.get(i) + " ");
		}
		
		Collections.reverse(ssort);
		System.out.println("\n내림차순");
		for (String s1 : ssort) {
			System.out.print(s1 + " ");
		}
		
	}

}
