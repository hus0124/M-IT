package prob11to20;

import java.util.Random;

public class Prob14 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int sum = 0;
		
		for(int i = 1; i < 51; i++) {
			int num = ran.nextInt(101);
		    System.out.printf("%d\t", num);
			if(i % 6==0)
				System.out.println();
			sum+=num;
		}
		
		System.out.println("\nÇÕ = " + sum);
	}

}
