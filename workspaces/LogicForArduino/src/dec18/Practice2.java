package dec18;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 윤년. 연도가 4로 나누어 떨어지되 100으로는 나뉘어 떨어지면 안된다. 또는 400으로 나뉘어 떨어져야 한다.
		
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
