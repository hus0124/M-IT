package arrayBaekjun;

import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {
		
		int arr[] = new int[9];
						
		Scanner scan = new Scanner(System.in);
		
		System.out.println("서로 다른 9개의 자연수 입력 : ");
		
		for(int i = 0; i < 9; i++){
		arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
				
		for(int i = 0; i < 9; i++){
			if(max < arr[i])
			max = arr[i];
		}
		
		System.out.println("최대값 = " + max);
		
		for(int i=0; i < 9; i++){
			if(max==arr[i]){
		System.out.println(i+1);}		
		}
	
	}

}
