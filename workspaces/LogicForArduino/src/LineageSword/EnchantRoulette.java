package LineageSword;

import java.util.Random;

public class EnchantRoulette {



	int roulette() {
		Random random = new Random();
		int count=0;
		int swordlevel=0;
		int drng = 1;
		int comcom = random.nextInt(2*drng);
		if(count==comcom) {
			System.out.println("강화성공");
			swordlevel++;
			drng*=2;
			System.out.println("집행검 레벨 : " + swordlevel);
			return 1;
		}
		else {
			System.out.println("강화실패");
			return 0;
		}
		
	}
}
