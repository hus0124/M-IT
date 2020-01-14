package study.chap05_Nov06;

import java.util.Scanner;

public class ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1, 2, 3, 4};	// 배열의 크기가 4
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		int arr2[];	// 선언하되 초기화 안 함. 
		int num = 1;
		
		arr2 = new int[5];	// 5행 크기로 초기화. new 로 객체 생성. 인스턴스화. 메모리 할당.
							
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = num++;
		}
		
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		int arr3[] = new int[5];		// 초기화 하되 내용 없으면 일단 0 으로 채워짐.
		for(int i = 0; i < arr3.length; i++)
		{
			System.out.print(arr3[i] + " ");
		}
         
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int len = scanner.nextInt();		// 배열의 크기를 입력 받도록 지정
		double darr[] = new double[len];	// 입력 받은 값을 변수로 이용
		System.out.println("배열 darr의 크기 = " + darr.length);
				
		
	}

}
