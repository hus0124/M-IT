package methodFunction;

import java.util.Scanner;

public class Function2 {

	public static void main(String[] args) {
		//별 모양이 n개 찍히기 *****
		
		Scanner scan = new Scanner(System.in);
		System.out.print("별 개수 몇 개? : ");
		int num = scan.nextInt();
		starPrint(num);
		scan.close();
	}

	private static void starPrint(int star) {
		for(int i = 0; i < star; i++)
		System.out.print("*");
	}

	
}
