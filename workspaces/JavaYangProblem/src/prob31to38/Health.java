package prob31to38;

import java.util.Scanner;

public class Health {
	Scanner scan = new Scanner(System.in);
	char gender;
	double tall;
	double weight;
	
	Health(){
		gender = 0;
		tall = 0.0;
		weight = 0.0;
	}
	
	void input() {
				
		System.out.println("***** 비만도 Check *****");
		System.out.printf("성별(M/F) : ");
		gender = scan.next().charAt(0);
		System.out.printf("신장(Cm) : ");
		tall = scan.nextFloat();
		System.out.printf("체중(Kg) : ");
		weight = scan.nextFloat();
		
	}
	
	void output() {
		System.out.println("\n성별 - " + gender);
		System.out.printf("신장 - %.2fCm\n", tall);
		System.out.printf("체중 - %.2fKg\n", weight);
		
	}
}
