package LineageSword;

import java.util.Random;
import java.util.Scanner;

public class Lineage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		boolean run1 = true;
		int count=0;
		int swordlevel=0;
		int drng = 1;
		System.out.println("**********����� �̱�**********");
		System.out.println("1������ 20������ 20���� �ڽ� �� �ϳ��� �����ϼ���");
		
		while(run) {
		System.out.print("�� �� ���ڸ� �����Ͻðڽ��ϱ�? : ");
		
		int boxnum = scanner.nextInt();
		
		SwordBox sbox = new SwordBox();
		
			switch(sbox.swordbox(boxnum)) {
			case 0:
				run=false;
				break;
			case 1:
				System.out.println("��� �õ��սô�");
				break;
			}
		}	// ���� ���� �������´ٴ� �� ����� �̴´ٴ� ��	

		while(run1) {
			
		System.out.print("������� ��ȭ�Ͻðڽ��ϱ�? y/n : ");
		String schoice = scanner.nextLine();
			if(schoice.equals("n")) {
				System.out.println("��ȭ�� �����մϴ�.");
				run1=false;
			}
			if(schoice.equals("y")) {
				System.out.println("��ȭ�� �����մϴ�.");
				
				Random random = new Random();
				
				int comcom = random.nextInt(2*drng);
				if(count==comcom) {
					System.out.println("��ȭ����");
					swordlevel++;
					drng*=2;
					System.out.println("����� ���� : " + swordlevel);
					
				}
				else {
					System.out.println("��ȭ����");
					run1=false;
				}
			}
				
			
		}	// ��ȭ ��
		
	}
		
}


