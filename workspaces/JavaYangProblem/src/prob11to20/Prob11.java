package prob11to20;

import java.util.Scanner;

public class Prob11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("A���� �Է��Ͻÿ�: ");
		float A = scan.nextFloat();
		System.out.printf("B���� �Է��Ͻÿ�: ");
		float B = scan.nextFloat();
		System.out.printf("�����ڸ� �Է�(+,-,*,/): ");
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
			System.out.println("������ error");
			break;	
		}
	}

}
