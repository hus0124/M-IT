package prob11to20;

import java.util.Scanner;

public class Prob15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int randnum= (int)(Math.random()*100);
		
		System.out.println("***������ �߻��Ͽ����ϴ�...���߾� ������...***");
		
		
		int count = 1;
		
		loop:
			for(;;) {
				System.out.printf("���� �Է� : ");
				int usernum = scan.nextInt();
				
				if(usernum > randnum) {
					System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�..");
					count++;
				}
				else if(usernum < randnum) {
					System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�..");
					count++;
				}
				else {
					System.out.println("��ī��ī..." + count + "������ ���߼̽��ϴ�...");
					break loop;
				}
					
			}
		scan.close();
	}

}
