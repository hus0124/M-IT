package dec18;

import java.util.Scanner;

public class Forpractice2 {

	public static void main(String[] args) {
		// 1���� �Է¹��� ������ ��� ����.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1���� ����ڰ� �Է��� ���ڱ��� ���մϴ�.");
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scanner.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("��� ��� : " + sum);
		
		scanner.close();
	}

}
