package dec18;

import java.util.Scanner;

public class Forpractice2 {

	public static void main(String[] args) {
		// 1부터 입력받은 수까지 모두 더함.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 사용자가 입력한 숫자까지 더합니다.");
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("계산 결과 : " + sum);
		
		scanner.close();
	}

}
