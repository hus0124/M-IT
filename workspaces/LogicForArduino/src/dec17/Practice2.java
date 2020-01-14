package dec17;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		boolean run = true;
		int count = 5;
		// int num = (int)(Math.random()*50)+1;	// 1에서 50까지
		
		Random ran = new Random();
		
		int num = ran.nextInt(20)+1;	// 0에서 40까지. 거기에 10 더하면 10에서 50까지
		
		Scanner scan = new Scanner(System.in);
		
		while(run){
			System.out.print("숫자를 입력하세요 : ");
			int num2 = scan.nextInt();
		
			if(num!=num2){
				count--;
				System.out.println("틀렸습니다");
							
				if(num > num2 & count > 0) {
					System.out.println("정답은 " + num2 + "보다 큰 수 입니다");
					System.out.println(count + "회 기회가 남았습니다.");
				}
				if(num < num2 & count > 0) {
					System.out.println("정답은 " + num2 + "보다 작은 수입니다");
					System.out.println(count + "회 기회가 남았습니다.");
				}
								
				if(count==0) {
					System.out.println();
					System.out.println("5회 입력 초과!");
					System.out.println("정답은 " + num + "입니다.");
					System.out.println("Human, You Lose. Game over!");
					run = false;
				}
			
			}
			
			else{
			System.out.println("맞았습니다");
			System.out.println("시도 횟수 : " + count);
			run = false;
			}
		}
		
		scan.close();

	}

}
