package dec18;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println();
		
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println();
		
		System.out.println("큰 수는 " + largerFind(num1,num2));
	
		scan.close();
	}

	static int largerFind(int a, int b) {
		int result=0;
		if(a>b)
			result=a;
		if(a<b)
			result=b;
		if(a==b)
			result=a;
		return result;	
	}
}
