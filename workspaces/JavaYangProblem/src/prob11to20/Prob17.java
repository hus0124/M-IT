package prob11to20;

import java.util.Scanner;

public class Prob17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("x�� ���� �Է��Ͻÿ� : ");
		int x = scan.nextInt();
		System.out.printf("y�� ���� �Է��Ͻÿ� : ");
		int y = scan.nextInt();
		scan.close();
		
		int square = 1;
		for(int i = 1; i <= y ; i++) {
			square *= x;
		}
		System.out.printf("%d�� %d ������ %d", x, y, square);
	}

}
