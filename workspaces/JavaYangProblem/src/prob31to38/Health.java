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
				
		System.out.println("***** �񸸵� Check *****");
		System.out.printf("����(M/F) : ");
		gender = scan.next().charAt(0);
		System.out.printf("����(Cm) : ");
		tall = scan.nextFloat();
		System.out.printf("ü��(Kg) : ");
		weight = scan.nextFloat();
		
	}
	
	void output() {
		System.out.println("\n���� - " + gender);
		System.out.printf("���� - %.2fCm\n", tall);
		System.out.printf("ü�� - %.2fKg\n", weight);
		
	}
}
