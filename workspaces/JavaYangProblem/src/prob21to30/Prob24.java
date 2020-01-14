package prob21to30;

import java.util.Random;
import java.util.Scanner;

public class Prob24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		loop:
		for(;;) {
		Random random = new Random();
			
		int randnum = random.nextInt(3);
		int count = 1;
		
			loop2:
			for(;;) {
				System.out.printf("숫자입력(0~100) : ");
				int usernum = scan.nextInt();
				
				if(usernum < randnum) {
					System.out.println("그거보다 크다");
					count++;
				}
				else if(usernum > randnum) {
					System.out.println("그거보다 작다");
					count++;
				}
				else {
					System.out.println("맞았다(" + count + "번)");
					break loop2;
				}
			}
		
		loop3:
			for(;;) {
			System.out.printf("계속(y/n) : ");
			String yesorno = scan.next();
			if (yesorno.equals("n")) {
				System.out.println("종료");
				scan.close();
				break loop;
				}
			else if(yesorno.equals("y")) {
				break loop3;
			}
			else
				System.out.println("올바른 키를 입력하세요(y/n)");
			}
		
		}
		
		
	}

}
