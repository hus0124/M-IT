package dec17;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		boolean run = true;
		int count = 5;
		// int num = (int)(Math.random()*50)+1;	// 1���� 50����
		
		Random ran = new Random();
		
		int num = ran.nextInt(20)+1;	// 0���� 40����. �ű⿡ 10 ���ϸ� 10���� 50����
		
		Scanner scan = new Scanner(System.in);
		
		while(run){
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int num2 = scan.nextInt();
		
			if(num!=num2){
				count--;
				System.out.println("Ʋ�Ƚ��ϴ�");
							
				if(num > num2 & count > 0) {
					System.out.println("������ " + num2 + "���� ū �� �Դϴ�");
					System.out.println(count + "ȸ ��ȸ�� ���ҽ��ϴ�.");
				}
				if(num < num2 & count > 0) {
					System.out.println("������ " + num2 + "���� ���� ���Դϴ�");
					System.out.println(count + "ȸ ��ȸ�� ���ҽ��ϴ�.");
				}
								
				if(count==0) {
					System.out.println();
					System.out.println("5ȸ �Է� �ʰ�!");
					System.out.println("������ " + num + "�Դϴ�.");
					System.out.println("Human, You Lose. Game over!");
					run = false;
				}
			
			}
			
			else{
			System.out.println("�¾ҽ��ϴ�");
			System.out.println("�õ� Ƚ�� : " + count);
			run = false;
			}
		}
		
		scan.close();

	}

}
