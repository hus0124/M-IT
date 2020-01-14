package prob11to20;

import java.util.Scanner;

public class Prob13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연도를 입력하시오 : ");
		int year = scanner.nextInt();
		
		if(year%100!=0 && year%4==0)
			System.out.println(year + "년은 윤년입니다");
		else if(year%400==0)
			System.out.println(year + "년은 윤년입니다");
		else 
			System.out.println(year + "년은 윤년이 아닙니다");

		scanner.close();


	}

}
