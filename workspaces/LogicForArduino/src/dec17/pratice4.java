package dec17;

import java.util.Random;
import java.util.Scanner;

public class pratice4 {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int sum=0;
		
		System.out.print("판돈을 걸어주세요 : ");
		int money = scan.nextInt();
		
		while(run) {
		
		int num = ran.nextInt(10)+1;
		
		System.out.println("1은 홀, 2는 짝, 0은 종료");
		System.out.println("====================");
		System.out.println("숫자를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		if(num%2!=0){
			switch(num2) {
			case 1:
			System.out.println("홀, 맞췄습니다");
			sum+=money;
			System.out.println("현재 잔고 : " + sum);
			break;
			case 2:
			System.out.println("틀렸습니다");
			sum-=money;
			System.out.println("현재 잔고 : " + sum);
			break;
			}
		}
		
		if(num%2==0){
			switch(num2) {
			case 1:
			System.out.println("틀렸습니다");
			sum-=money;
			System.out.println("현재 잔고 : " + sum);
			break;
			case 2:
			System.out.println("짝, 맞췄습니다");
			sum+=money;
			System.out.println("현재 잔고 : " + sum);
			break;
			}
		}
		
		if(num2==0) {
			System.out.println("종료");
			run=false;
		}
		
  }

 }
}	
