package dec18;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// ����. ������ 4�� ������ �������� 100���δ� ������ �������� �ȵȴ�. �Ǵ� 400���� ������ �������� �Ѵ�.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		int year = scanner.nextInt();
		
		if(year%100!=0 && year%4==0)
			System.out.println(year + "���� �����Դϴ�");
		else if(year%400==0)
			System.out.println(year + "���� �����Դϴ�");
		else 
			System.out.println(year + "���� ������ �ƴմϴ�");

		scanner.close();
	}

}
