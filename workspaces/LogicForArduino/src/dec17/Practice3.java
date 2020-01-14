package dec17;

import java.util.Random;

public class Practice3 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		double count1=0;
		double count2=0;
		
		for(int i = 0; i < 10000000; i++) {
			int num = ran.nextInt(2)+1;
		
			if(num==1)
				count1++;
			else
				count2++;
		}
		
		double prob1 = ((count1)/10000000)*100;
		double prob2 = ((count2)/10000000)*100;		
		System.out.println("1ÀÌ ³ª¿Â È®·ü : " + prob1 + "%");
		System.out.println("2°¡ ³ª¿Â È®·ü : " + prob2 + "%");
	}

}
