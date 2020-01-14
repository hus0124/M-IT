package LineageSword;

import java.util.Random;

public class SwordBox {

	public int swordbox(int a) {
		Random random = new Random();
		int realbox = random.nextInt(1)+1;	// 1에서 20까지 박스 중 하나 상품 박스.
		if(a>0 && a<21) {
			if(realbox==a) {
				System.out.println("축하합니다! 집행검 뽑기 성공!");
				return 0;
			}
			else {
				System.out.println("꽝! 뽑기 실패...");
				return 1;
			}
		}
		else
			System.out.println("1부터 20 사이의 숫자를 입력하세요");
			return 1;
	}
	
}
