package dec17;

import java.util.Random;
import java.util.Scanner;

public class pratice4 {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int sum=0;
		
		System.out.print("�ǵ��� �ɾ��ּ��� : ");
		int money = scan.nextInt();
		
		while(run) {
		
		int num = ran.nextInt(10)+1;
		
		System.out.println("1�� Ȧ, 2�� ¦, 0�� ����");
		System.out.println("====================");
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num2 = scan.nextInt();
		
		if(num%2!=0){
			switch(num2) {
			case 1:
			System.out.println("Ȧ, ������ϴ�");
			sum+=money;
			System.out.println("���� �ܰ� : " + sum);
			break;
			case 2:
			System.out.println("Ʋ�Ƚ��ϴ�");
			sum-=money;
			System.out.println("���� �ܰ� : " + sum);
			break;
			}
		}
		
		if(num%2==0){
			switch(num2) {
			case 1:
			System.out.println("Ʋ�Ƚ��ϴ�");
			sum-=money;
			System.out.println("���� �ܰ� : " + sum);
			break;
			case 2:
			System.out.println("¦, ������ϴ�");
			sum+=money;
			System.out.println("���� �ܰ� : " + sum);
			break;
			}
		}
		
		if(num2==0) {
			System.out.println("����");
			run=false;
		}
		
  }

 }
}	
