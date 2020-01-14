package study_chap04;

import java.util.Scanner;

public class Exercise4_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;	// 무한루프 위한 변수
		
		int balance = 0;	// 첫 잔액 역할
		int choicenum;
		int value;
		Scanner scanner = new Scanner(System.in);
				
		while(run)
		{
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고| 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
					
			choicenum = scanner.nextInt();	// c언어의 scanf 기능. 
			
			
		switch(choicenum)
		 {
		
			case 1:
				System.out.print("예금액>");
				value = scanner.nextInt();	// balance += scanner.nextInt();로 바로 받아버려도 된다. 예금액 입력 값은 scanner로 들어가고 난뒤
				balance += value;			// 바로 balance와 연산된다.
				break;
			case 2:
				System.out.print("출금액>");
				value = scanner.nextInt();
				balance-= value;
				if (balance < 0)
					System.out.println("잔고가 부족합니다");
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:	
				System.out.println();
				run = false;
				break;
			default:
				System.out.println("올바른 메뉴를 입력하세요");
				break;
		 }
		
		}
		System.out.println("프로그램 종료");
	}

}
