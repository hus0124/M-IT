package prob01to10;

import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Input name : ");
		String name = scan.next();
		System.out.printf("kor : ");
		int korScore = scan.nextInt();
		System.out.printf("eng : ");
		int engScore = scan.nextInt();
		System.out.printf("mat : ");
		int mathScore = scan.nextInt();
		scan.close();
		
		float sum = korScore + engScore + mathScore;
		float avg = sum / 3;
		System.out.println("�̸� : " + name);
		System.out.println("�հ����� : " + sum);
		System.out.printf("������� : %.1f", avg);
	}

}
