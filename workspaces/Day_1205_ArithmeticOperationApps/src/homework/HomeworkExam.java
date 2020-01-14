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
			System.out.println("정수값 1 >> ");
			num1 = scan.nextInt();
			System.out.println("정수값 2 >> ");
			num2 = scan.nextInt();
			System.out.println("연산 선택 >> 1.더하기/ 2.빼기/ 3.곱하기/ 4.나누기/ 5.몫 ");
			cnum = scan.nextInt();
			
			switch(cnum){
			case 1 : 
				result = ao.addition(num1, num2);
				System.out.println("연산의 결과는 " + num1 + " " + "+" + " " + num2 + " = " + result + " 입니다.");
				break;
			case 2 :
				result = ao.subtraction(num1, num2);
				System.out.println("연산의 결과는 " + num1 + " " + "-" + " " + num2 + " = " + result + " 입니다.");
				break;
			case 3 : 
				result = ao.multiplication(num1, num2);
				System.out.println("연산의 결과는 " + num1 + " " + "*" + " " + num2 + " = " + result + " 입니다.");
				break;
			case 4 :
				System.out.println("연산의 결과는 " + num1 + " " + "/" + " " + num2 + " = " + (float)(ao.division(num1, num2)) + " 입니다.");
				break;
			case 5 :
				result = ao.quotient(num1, num2);
				System.out.println("연산의 결과는 " + num1 + " " + "%" + " " + num2 + " = " + result + " 입니다.");
				break;
							
			}
			
		}

	}

}
