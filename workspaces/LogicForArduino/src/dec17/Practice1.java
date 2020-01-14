package dec17;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		/*
		for(int i=2;i<10;i++) {
			System.out.println("3 X " + i + " = " + 3*i);
		}
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
				
		for(int i = 2; i < 10; i++) {
		if(i%2==0){
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		  }
		}
		
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run){
		System.out.print("구구단 단수를 입력해 주세요 : ");
		int i = scan.nextInt();
		
		if(i==0)
			System.out.println("0이 아닌 수를 입력하세요");
				
		else{
			for(int j = 1; j < 10; j++){
			System.out.println(i + " X " + j + " = " + i*j);
		    }
		   run=false;
		}
	}
		scan.close();
		
			
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		if(num%2==0)
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");
		scan.close();
		*/
		
		boolean run = true;
		int count = 1;
		// int num = (int)(Math.random()*50)+1;	// 1에서 50까지
		
		Random ran = new Random();
		
		int num = ran.nextInt(41)+10;	// 0에서 40까지. 거기에 10 더하면 10에서 50까지
		
		Scanner scan = new Scanner(System.in);
		
		while(run){
			System.out.print("숫자를 입력하세요 : ");
			int num2 = scan.nextInt();
		
			if(num!=num2){
			System.out.println("틀렸습니다");
				if(num > num2) {
					System.out.println("정답은 " + num2 + "보다 큰 수 입니다");
				}
				if(num < num2) {
					System.out.println("정답은 " + num2 + "보다 작은 수입니다");
				}
			count++;	
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
