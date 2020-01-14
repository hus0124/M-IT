package arrayBaekjun;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P2920 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[8];
		int uarr[] = new int[8];
		int darr[] = new int[8];
		
		System.out.print("숫자 입력: ");
		
		for(int i = 0; i < 8; i++){
			arr[i] = scan.nextInt();
			uarr[i] = arr[i];
			darr[i]	= arr[i];
		}
		
		scan.close();
		
		Arrays.sort(uarr);	// 오름차순
		
		List <int[]> list = Arrays.asList(darr);
		Collections.reverse(list);	// 내림차순
		
		for(int ele:arr){System.out.print(ele + " ");}
		System.out.println();
		for(int ele:uarr){System.out.print(ele + " ");}
		System.out.println();
		for(int ele:darr){System.out.print(ele + " ");}
		System.out.println();
//		if(Arrays.equals(arr, uarr))
//		{System.out.println("ascedning");}
//		else if(Arrays.equals(arr, darr))
//		{System.out.println("descending");}
//		else 
//		{System.out.println("mixed");}
		
	}

}
