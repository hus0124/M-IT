package prob21to30;

import java.util.Scanner;

public class Prob21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("ǰ�� : ");
		String item = scan.next();
		System.out.printf("���� : ");
		int qty = scan.nextInt();
		System.out.printf("�ܰ� : ");
		int price = scan.nextInt();
		scan.close();
		compute(item, qty, price);
	}

	private static void compute(String item, int qty, int price) {
		System.out.println("ǰ�� : " + item);
		
		System.out.println("�ݾ� : " + qty*price + "��");
		
	}

}
