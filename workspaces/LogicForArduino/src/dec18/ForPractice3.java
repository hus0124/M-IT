package dec18;

import java.util.Arrays;
import java.util.Random;

public class ForPractice3 {

	public static void main(String[] args) {
		Random random = new Random();
		int recount = 10000000;
		int[] diceArr = {0,0,0,0,0,0};
				
			for(int i = 0; i < recount; i++) {
				int num1 = random.nextInt(6)+1;
				switch(num1) {
				case 1:
					diceArr[0]++;
					break;
				case 2:
					diceArr[1]++;
					break;
				case 3:
					diceArr[2]++;
					break;
				case 4:
					diceArr[3]++;
					break;
				case 5:
					diceArr[4]++;
					break;
				case 6:
					diceArr[5]++;
					break;
				}
			}

			System.out.println(Arrays.toString(diceArr));
			
			for(int i = 0; i < 6; i++) {
			System.out.println("´«±Ý " + (i+1) + " È®·ü : " + ((double)diceArr[i]/recount)*100 + "%");
			}
			
	}

}
