package dec18;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ش� ���� �Է��ϼ��� : ");
		int mnum = scanner.nextInt();
		
		switch(changemonth(mnum)) {
		case 1:
			System.out.println("�ش� ���� 28�� �Դϴ�");
			break;
		case 2:
			System.out.println("�ش� ���� 30�� �Դϴ�");
			break;
		case 3:
			System.out.println("�ش� ���� 31�� �Դϴ�");
			break;
		case 4:
			System.out.println("1~12������ �� �� �ϳ��� �����ϼ���");
			break;
		}

		scanner.close();
	}

	private static int changemonth(int a) {
		if(a==2)
			return 1;
		else if(a==4 || a==6 || a==9 || a==11)
			return 2;
		else if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)
			return 3;
		else
			return 4;
	}

}
