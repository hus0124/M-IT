package arrayBaekjun;

import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {
		
		int arr[] = new int[9];
						
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �ٸ� 9���� �ڿ��� �Է� : ");
		
		for(int i = 0; i < 9; i++){
		arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
				
		for(int i = 0; i < 9; i++){
			if(max < arr[i])
			max = arr[i];
		}
		
		System.out.println("�ִ밪 = " + max);
		
		for(int i=0; i < 9; i++){
			if(max==arr[i]){
		System.out.println(i+1);}		
		}
	
	}

}
