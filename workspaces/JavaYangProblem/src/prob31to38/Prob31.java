package prob31to38;

import java.util.Scanner;

public class Prob31 {
	
		int r = 0;
		double size = 0;
		static final double PI = 3.141592;
		Scanner scan = new Scanner(System.in);
		
		Prob31() {
			System.out.printf("반지름 입력 : ");
			r = scan.nextInt();
			scan.close();
		}
		
		void process() {
			size = r*r*PI;
		}
		
		void output() {
			System.out.printf("원의 넓이 : %.2f", size);
		}
	

	public static void main(String[] args) {
		
		Prob31 circle = new Prob31();
		circle.process();
		circle.output();
				
	}

}
