package arrayBaekjun;

import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {
		
		int N;
		int arr[];
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력할 정수 N개: ");
		
		N = scan.nextInt();
		
		arr = new int[N];
		
		System.out.print("정수 N개 입력: ");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		
		}
		
		System.out.println(min + " " + max);
	}

}
