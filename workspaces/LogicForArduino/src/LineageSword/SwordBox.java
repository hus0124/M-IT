package LineageSword;

import java.util.Random;

public class SwordBox {

	public int swordbox(int a) {
		Random random = new Random();
		int realbox = random.nextInt(1)+1;	// 1���� 20���� �ڽ� �� �ϳ� ��ǰ �ڽ�.
		if(a>0 && a<21) {
			if(realbox==a) {
				System.out.println("�����մϴ�! ����� �̱� ����!");
				return 0;
			}
			else {
				System.out.println("��! �̱� ����...");
				return 1;
			}
		}
		else
			System.out.println("1���� 20 ������ ���ڸ� �Է��ϼ���");
			return 1;
	}
	
}
