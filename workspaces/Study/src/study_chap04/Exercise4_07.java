package study_chap04;

import java.util.Scanner;

public class Exercise4_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;	// ���ѷ��� ���� ����
		
		int balance = 0;	// ù �ܾ� ����
		int choicenum;
		int value;
		Scanner scanner = new Scanner(System.in);
				
		while(run)
		{
			System.out.println("---------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ�| 4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
					
			choicenum = scanner.nextInt();	// c����� scanf ���. 
			
			
		switch(choicenum)
		 {
		
			case 1:
				System.out.print("���ݾ�>");
				value = scanner.nextInt();	// balance += scanner.nextInt();�� �ٷ� �޾ƹ����� �ȴ�. ���ݾ� �Է� ���� scanner�� ���� ����
				balance += value;			// �ٷ� balance�� ����ȴ�.
				break;
			case 2:
				System.out.print("��ݾ�>");
				value = scanner.nextInt();
				balance-= value;
				if (balance < 0)
					System.out.println("�ܰ� �����մϴ�");
				break;
			case 3:
				System.out.println("�ܰ�>" + balance);
				break;
			case 4:	
				System.out.println();
				run = false;
				break;
			default:
				System.out.println("�ùٸ� �޴��� �Է��ϼ���");
				break;
		 }
		
		}
		System.out.println("���α׷� ����");
	}

}
