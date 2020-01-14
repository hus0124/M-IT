package dec18;

import java.util.Scanner;

public class DoWhilePractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		do {
			System.out.print("정수를 입력하세요 : ");
			num = scanner.nextInt();
			sum+=num;
			System.out.println("지금까지 입력한 수의 합은 " + sum + "입니다");
			
			if(num==0)
				System.out.println("종료합니다");
		}while(num!=0);

		scanner.close();
	}

}
