package dec18;

import java.util.Scanner;

public class DoWhilePractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		do {
			System.out.print("������ �Է��ϼ��� : ");
			num = scanner.nextInt();
			sum+=num;
			System.out.println("���ݱ��� �Է��� ���� ���� " + sum + "�Դϴ�");
			
			if(num==0)
				System.out.println("�����մϴ�");
		}while(num!=0);

		scanner.close();
	}

}
