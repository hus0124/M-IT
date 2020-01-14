package prob01to10;

import java.util.Scanner;

public class Prob06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**** ªÔ∞¢«¸¿« ≥–¿Ã ±∏«œ±‚ ****");
		System.out.printf("πÿ∫Ø : ");
		float downLine = scan.nextFloat();
		System.out.printf("≥Ù¿Ã: ");
		float height = scan.nextFloat();
		scan.close();
		
		float surface = (downLine * height) / 2;
		
		System.out.printf("≥–¿Ã : %.2f", surface);
	}

}
