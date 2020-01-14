package prob11to20;

import java.util.Scanner;

public class Prob11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("A값을 입력하시오: ");
		float A = scan.nextFloat();
		System.out.printf("B값을 입력하시오: ");
		float B = scan.nextFloat();
		System.out.printf("연산자를 입력(+,-,*,/): ");
		String operator = scan.next();
		scan.close();
		
		switch(operator) {
		case "+":
			System.out.printf("%.2f + %.2f = %.2f", A, B, A+B);
			break;
		case "-":
			System.out.printf("%.2f - %.2f = %.2f", A, B, A-B);
			break;
		case "*":
			System.out.printf("%.2f * %.2f = %.2f", A, B, A*B);
			break;
		case "/":
			System.out.printf("%.2f / %.2f = %.2f", A, B, A/B);
			break;
		default:
			System.out.println("연산자 error");
			break;	
		}
	}

}
