package study_chap04;

import java.util.Scanner;	// �ܺο��� ���ǵ� class ����� �� import �ؼ� �����´�.

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		// �ڹٿ��� ���� �Է� �ޱ�. scanner �� c��� scanf �� �ش��ϴ� ����̴�.
		System.out.print("���� �Է�: ");		// println printf ���� Ŀ���� �ٷ� ������ �� �� �ְ� print�� �� ��
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		switch (num)
		{
		case 1:
			System.out.println("���ϱ�");
		    break;
		
	    case 2:
		System.out.println("����");
	    break;
	
	    case 3:
	    System.out.println("���ϱ�");
	    break;

	    default:
	    System.out.printf("������");
	}

		// �ڹٿ����� ���ڿ��� �����ϴ�
		String value;
		System.out.println("�޴� ����: ");
		value = scanner.next(); 	// next() ���ڿ� �Է�
		
		switch (value)
		{
		case "10":
			System.out.println("10��");
			break;
		case "20":
			System.out.println("20��");
			break;
		default:
			System.out.println("��Ÿ");
			break;
				
		}
}
}
