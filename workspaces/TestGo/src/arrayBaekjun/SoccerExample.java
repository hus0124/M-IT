package arrayBaekjun;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SoccerExample {

	public static void main(String[] args) {
		SoccerPlayer[] sp = {
				new SoccerPlayer("Zidane", "France", "MF", 5),
				new SoccerPlayer("Messi", "Argentina", "CF", 10),
				new SoccerPlayer("Baresi", "Italy", "CB", 4),
				new SoccerPlayer("Gulit", "Holland", "MF", 7) };

		Comparator<SoccerPlayer> comparator = new Comparator<SoccerPlayer>(){
			@Override
			public int compare(SoccerPlayer o1, SoccerPlayer o2){
				return Integer.compare(o2.getBackno(), o1.getBackno());
			}
				
		};

		Arrays.sort(sp, comparator);
		
		for (SoccerPlayer st:sp){
			System.out.println(st.getName() + ":" + st.getNation() + ":" + st.getPosition() + ":" + st.getBackno() + ":");
		}
	}

}
