package dec18;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է��ϼ��� : ");
		int num1 = scan.nextInt();
		System.out.println();
		
		System.out.print("�� ��° ���� �Է��ϼ��� : ");
		int num2 = scan.nextInt();
		System.out.println();
		
		System.out.println("ū ���� " + largerFind(num1,num2));
	
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
