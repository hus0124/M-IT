package prob01to10;

import java.util.Scanner;

public class Prob06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**** �ﰢ���� ���� ���ϱ� ****");
		System.out.printf("�غ� : ");
		float downLine = scan.nextFloat();
		System.out.printf("����: ");
		float height = scan.nextFloat();
		scan.close();
		
		float surface = (downLine * height) / 2;
		
		System.out.printf("���� : %.2f", surface);
	}

}
