package prob21to30;

import java.util.Random;
import java.util.Scanner;

public class Prob24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		loop:
		for(;;) {
		Random random = new Random();
			
		int randnum = random.nextInt(3);
		int count = 1;
		
			loop2:
			for(;;) {
				System.out.printf("�����Է�(0~100) : ");
				int usernum = scan.nextInt();
				
				if(usernum < randnum) {
					System.out.println("�װź��� ũ��");
					count++;
				}
				else if(usernum > randnum) {
					System.out.println("�װź��� �۴�");
					count++;
				}
				else {
					System.out.println("�¾Ҵ�(" + count + "��)");
					break loop2;
				}
			}
		
		loop3:
			for(;;) {
			System.out.printf("���(y/n) : ");
			String yesorno = scan.next();
			if (yesorno.equals("n")) {
				System.out.println("����");
				scan.close();
				break loop;
				}
			else if(yesorno.equals("y")) {
				break loop3;
			}
			else
				System.out.println("�ùٸ� Ű�� �Է��ϼ���(y/n)");
			}
		
		}
		
		
	}

}
