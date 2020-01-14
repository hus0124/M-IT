package prob11to20;

import java.util.Scanner;

public class Prob15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int randnum= (int)(Math.random()*100);
		
		System.out.println("***난수가 발생하였습니다...맞추어 보세요...***");
		
		
		int count = 1;
		
		loop:
			for(;;) {
				System.out.printf("숫자 입력 : ");
				int usernum = scan.nextInt();
				
				if(usernum > randnum) {
					System.out.println("컴퓨터의 숫자가 더 작습니다..");
					count++;
				}
				else if(usernum < randnum) {
					System.out.println("컴퓨터의 숫자가 더 큽니다..");
					count++;
				}
				else {
					System.out.println("추카추카..." + count + "번만에 맞추셨습니다...");
					break loop;
				}
					
			}
		scan.close();
	}

}
