package methodFunction;

import java.util.Scanner;

public class Function2 {

	public static void main(String[] args) {
		//�� ����� n�� ������ *****
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� �� ��? : ");
		int num = scan.nextInt();
		starPrint(num);
		scan.close();
	}

	private static void starPrint(int star) {
		for(int i = 0; i < star; i++)
		System.out.print("*");
	}

	
}
