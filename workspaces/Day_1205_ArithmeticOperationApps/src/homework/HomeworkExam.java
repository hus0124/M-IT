package homework;

import java.util.Scanner;

public class HomeworkExam {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int cnum = 0;
		int result = 0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		ArithmeticOperations ao = new ArithmeticOperations();
		
		while(run){
			System.out.println("===============================");
			System.out.println("������ 1 >> ");
			num1 = scan.nextInt();
			System.out.println("������ 2 >> ");
			num2 = scan.nextInt();
			System.out.println("���� ���� >> 1.���ϱ�/ 2.����/ 3.���ϱ�/ 4.������/ 5.�� ");
			cnum = scan.nextInt();
			
			switch(cnum){
			case 1 : 
				result = ao.addition(num1, num2);
				System.out.println("������ ����� " + num1 + " " + "+" + " " + num2 + " = " + result + " �Դϴ�.");
				break;
			case 2 :
				result = ao.subtraction(num1, num2);
				System.out.println("������ ����� " + num1 + " " + "-" + " " + num2 + " = " + result + " �Դϴ�.");
				break;
			case 3 : 
				result = ao.multiplication(num1, num2);
				System.out.println("������ ����� " + num1 + " " + "*" + " " + num2 + " = " + result + " �Դϴ�.");
				break;
			case 4 :
				System.out.println("������ ����� " + num1 + " " + "/" + " " + num2 + " = " + (float)(ao.division(num1, num2)) + " �Դϴ�.");
				break;
			case 5 :
				result = ao.quotient(num1, num2);
				System.out.println("������ ����� " + num1 + " " + "%" + " " + num2 + " = " + result + " �Դϴ�.");
				break;
							
			}
			
		}

	}

}
