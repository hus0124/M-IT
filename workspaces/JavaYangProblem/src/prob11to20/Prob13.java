package prob11to20;

import java.util.Scanner;

public class Prob13 {

	public static void main(String[] args) {
		
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
