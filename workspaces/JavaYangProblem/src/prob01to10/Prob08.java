package prob01to10;

import java.util.Scanner;

public class Prob08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("점수입력 : ");
		int inputNum = scan.nextInt();
		scan.close();
		
		if(inputNum < 0 || inputNum > 100) {
			System.out.println("입력오류!!");
		}
		else
			System.out.println("입력된값 : " + inputNum);
	}

}
