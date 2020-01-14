package prob01to10;

import java.util.Scanner;

public class Prob07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Input a : ");
		int A = scan.nextInt();
		System.out.printf("Input b : ");
		int B = scan.nextInt();
		scan.close();
		
		int result = (A > B) ? A : B;
		
		System.out.println("Å« ¼ö : " + result);
	}

}
