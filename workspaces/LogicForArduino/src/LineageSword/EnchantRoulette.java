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
			System.out.println("��ȭ����");
			swordlevel++;
			drng*=2;
			System.out.println("����� ���� : " + swordlevel);
			return 1;
		}
		else {
			System.out.println("��ȭ����");
			return 0;
		}
		
	}
}
