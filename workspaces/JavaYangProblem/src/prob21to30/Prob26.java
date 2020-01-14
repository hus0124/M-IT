package prob21to30;

import java.util.Arrays;
import java.util.Random;

public class Prob26 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
		int randnum = random.nextInt(50)+1;
		arr[i] = randnum;
		}
		
		System.out.println("[정렬전]");
		for(int i=0; i < 5; i++) {
			System.out.printf("num[%d] = %d\t", i, arr[i]);
		}
		
		System.out.println("\n[정렬후]");
		Arrays.sort(arr);
		for(int i=0; i < 5; i++) {
			System.out.printf("num[%d] = %d\t", i, arr[i]);
		}
	}

}
