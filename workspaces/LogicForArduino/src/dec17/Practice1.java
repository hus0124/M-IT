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
		System.out.print("������ �ܼ��� �Է��� �ּ��� : ");
		int i = scan.nextInt();
		
		if(i==0)
			System.out.println("0�� �ƴ� ���� �Է��ϼ���");
				
		else{
			for(int j = 1; j < 10; j++){
			System.out.println(i + " X " + j + " = " + i*j);
		    }
		   run=false;
		}
	}
		scan.close();
		
			
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = scan.nextInt();
		if(num%2==0)
			System.out.println("¦���Դϴ�");
		else
			System.out.println("Ȧ���Դϴ�");
		scan.close();
		*/
		
		boolean run = true;
		int count = 1;
		// int num = (int)(Math.random()*50)+1;	// 1���� 50����
		
		Random ran = new Random();
		
		int num = ran.nextInt(41)+10;	// 0���� 40����. �ű⿡ 10 ���ϸ� 10���� 50����
		
		Scanner scan = new Scanner(System.in);
		
		while(run){
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int num2 = scan.nextInt();
		
			if(num!=num2){
			System.out.println("Ʋ�Ƚ��ϴ�");
				if(num > num2) {
					System.out.println("������ " + num2 + "���� ū �� �Դϴ�");
				}
				if(num < num2) {
					System.out.println("������ " + num2 + "���� ���� ���Դϴ�");
				}
			count++;	
			}
			
			else{
			System.out.println("�¾ҽ��ϴ�");
			System.out.println("�õ� Ƚ�� : " + count);
			run = false;
			}
		}
		
		scan.close();
 }
}
