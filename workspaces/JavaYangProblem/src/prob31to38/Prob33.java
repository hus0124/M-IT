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
		System.out.printf("반지름 입력 : ");
		int radius = scan.nextInt();
		area = (double)radius*radius*PI;
		output();
	}
	
	void triangle() {
		System.out.printf("밑변 입력 : ");
		int bottom = scan.nextInt();
		System.out.printf("높이 입력 : ");
		int height = scan.nextInt();
		area = (double)(bottom*height)/2;
		output();
	}
	
	void trapezoid() {
		System.out.printf("아랫변 입력 : ");
		int bottom = scan.nextInt();
		System.out.printf("윗변 입력 : ");
		int top = scan.nextInt();
		System.out.printf("높이 입력 : ");
		int height = scan.nextInt();
		area = (double)(bottom + top)*height/2;
		output();
	}
	
	void output() {
		System.out.printf("넓이 = %.2f", area);
	}
	
	int menu() {
		loop:
			for(;;) {
				System.out.printf("\n***** 도형선택 *****\n");
				System.out.println("1. 삼각형");
				System.out.println("2. 원");
				System.out.println("3. 사다리꼴");
				System.out.println("4. 종료\n");
				System.out.printf("선택 : ");
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
					System.out.println("\n감사합니다^.^");
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
