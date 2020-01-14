package prob31to38;

import java.util.Scanner;

public class Prob33 {
	
	double area;
	static final double PI = 3.141592;
	Scanner scan = new Scanner(System.in);
	Prob33(){
		area = 0.0;
	}
	
	void circle(){
		System.out.printf("������ �Է� : ");
		int radius = scan.nextInt();
		area = (double)radius*radius*PI;
		output();
	}
	
	void triangle() {
		System.out.printf("�غ� �Է� : ");
		int bottom = scan.nextInt();
		System.out.printf("���� �Է� : ");
		int height = scan.nextInt();
		area = (double)(bottom*height)/2;
		output();
	}
	
	void trapezoid() {
		System.out.printf("�Ʒ��� �Է� : ");
		int bottom = scan.nextInt();
		System.out.printf("���� �Է� : ");
		int top = scan.nextInt();
		System.out.printf("���� �Է� : ");
		int height = scan.nextInt();
		area = (double)(bottom + top)*height/2;
		output();
	}
	
	void output() {
		System.out.printf("���� = %.2f", area);
	}
	
	int menu() {
		loop:
			for(;;) {
				System.out.printf("\n***** �������� *****\n");
				System.out.println("1. �ﰢ��");
				System.out.println("2. ��");
				System.out.println("3. ��ٸ���");
				System.out.println("4. ����\n");
				System.out.printf("���� : ");
				int choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					triangle();
					break;
				case 2:
					circle();
					break;
				case 3:
					trapezoid();
					break;
				case 4:
					System.out.println("\n�����մϴ�^.^");
					break loop;
				}
			}
		return 0;
	}
	public static void main(String[] args) {
		
		Prob33 ob1 = new Prob33();
		
		ob1.menu();
	}

}
