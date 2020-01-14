package prob21to30;

import java.util.Scanner;

public class Prob22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("배열의 개수 입력 : ");
		int num = scan.nextInt();
		
		
		float[] score = new float[num];
		float sum = 0;
				
		for(int i = 0; i < num; i++) {
			System.out.printf("score[%s] : ", i);
			score[i] = scan.nextFloat();
			sum += score[i];
		}
		float avg = sum / num;
		System.out.printf("평균 : %.2f", avg);
		
		scan.close();
	}

}
