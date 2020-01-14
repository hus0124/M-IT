package prob21to30;

import java.util.Scanner;

public class Prob21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("품명 : ");
		String item = scan.next();
		System.out.printf("수량 : ");
		int qty = scan.nextInt();
		System.out.printf("단가 : ");
		int price = scan.nextInt();
		scan.close();
		compute(item, qty, price);
	}

	private static void compute(String item, int qty, int price) {
		System.out.println("품명 : " + item);
		
		System.out.println("금액 : " + qty*price + "원");
		
	}

}
